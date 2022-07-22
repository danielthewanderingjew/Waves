package com.example.waves.ui.surfspots;

public class SurfLocationInfo {
    private String location;
    private int tide;
    private int windSpeed;
    private int waterTemperature;
    private int surfHeight;

    public SurfLocationInfo(String location, int tide, int windSpeed,
                            int waterTemperature, int surfHeight) {
        this.location = location;
        this.tide = tide;
        this.windSpeed = windSpeed;
        this.waterTemperature = waterTemperature;
        this.surfHeight = surfHeight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTide() {
        return tide;
    }

    public void setTide(int tide) {
        this.tide = tide;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public int getSurfHeight() {
        return surfHeight;
    }

    public void setSurfHeight(int surfHeight) {
        this.surfHeight = surfHeight;
    }
}
