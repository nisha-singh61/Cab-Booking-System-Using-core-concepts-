package org.example;

    public record Location(double latitude, double longitude) {

        // A simple math method to calculate the distance to another location
        public double calculateDistance(Location other) {
            double latDiff = this.latitude - other.latitude;
            double lonDiff = this.longitude - other.longitude;
            return Math.sqrt(latDiff * latDiff + lonDiff * lonDiff);
        }
    }

