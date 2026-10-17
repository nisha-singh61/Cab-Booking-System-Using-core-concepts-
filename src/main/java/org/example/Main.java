package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Cab Booking System: Step 1 ---");

        //Create coordinates for the driver and user
        Location driverLocation = new Location(12.9716, 77.5946);
        Location userLocation = new Location(12.9352, 77.6245);

        //Test the distance calculation method
        double distance = driverLocation.calculateDistance(userLocation);
        System.out.println("Distance between driver and user: " + distance);

        //Print the driver and user details
        Driver driver = new Driver("D001", "John Doe", "1234567890", driverLocation, "KA-01-AB-1234", true);
        User user = new User("U001", "Jane Smith", "0987654321");
        System.out.println(driver);
        System.out.println(user);
    }
}
