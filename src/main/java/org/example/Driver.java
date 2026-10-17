package org.example;

public class Driver {
    private String driverId;
    private String name;
    private String contactNumber;
    private Location currentLocation;
    private String vehicleNumber;
    private boolean isAvailable;

    // Constructor
    public Driver(String driverId, String name, String contactNumber, Location currentLocation, String vehicleNumber, boolean isAvailable) {
        this.driverId = driverId;
        this.name = name;
        this.contactNumber = contactNumber;
        this.currentLocation = currentLocation;
        this.vehicleNumber = vehicleNumber;
        this.isAvailable = true;  //drivers are free by default when they log in to the system
    }

    // Getters
    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Override toString method for better readability
    @Override
    public String toString() {
        return "Driver{" +
                "driverId='" + driverId + '\'' +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", currentLocation=" + currentLocation +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
