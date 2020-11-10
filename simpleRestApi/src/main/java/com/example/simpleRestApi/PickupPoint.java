package com.example.simpleRestApi;

public class PickupPoint {

    public double latitude;
    public double longitude;
    public String placeName;

    public PickupPoint(double latitude, double longitude, String placeName) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.placeName = placeName;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getPlaceName() {
        return placeName;
    }

    public double getLongitude() {
        return longitude;
    }

}
