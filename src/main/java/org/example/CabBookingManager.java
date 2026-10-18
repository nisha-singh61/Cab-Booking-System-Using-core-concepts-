package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CabBookingManager {
    // Maps allow us to look up drivers and riders instantly by their ID O(1) time complexity
    private Map<String, Driver> driverMap = new HashMap<>();
    private Map<String, User> userMap = new HashMap<>();

    // Register a new driver into the system
    public void addDriver(Driver driver) {
        driverMap.put(driver.getDriverId(), driver);
    }

    // Register a new user into the system
    public void addUser(User user) {
        userMap.put(user.getUserId(), user);
    }

    // Find nearby available drivers using Java Streams and custom Comparator
    public List<Driver> findNearbyDrivers(Location pickupLocation, double maxRadius) {
        return driverMap.values().stream()
                // 1. Filter only drivers who are currently available
                .filter(Driver::isAvailable)
                // 2. Filter drivers who are within the maximum radius distance
                .filter(driver -> driver.getCurrentLocation().calculateDistance(pickupLocation) <= maxRadius)
                // 3. Sort them from closest to farthest using a custom Comparator
                .sorted((d1, d2) -> {
                    double dist1 = d1.getCurrentLocation().calculateDistance(pickupLocation);
                    double dist2 = d2.getCurrentLocation().calculateDistance(pickupLocation);
                    return Double.compare(dist1, dist2);
                })
                // 4. Collect the results into a List
                .collect(Collectors.toList());
    }
}