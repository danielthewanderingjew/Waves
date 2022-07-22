package com.example.waves.ui.dashboard;

public class SurfSpotInfo {
    private int time;
    private int startSurfDepth;
    private int endSurfDepth;
    private int swellRating;
    private double swellLength;
    private int swellTime;
    private int windSpeed;

    public SurfSpotInfo(int time, int startSurfDepth, int endSurfDepth, int swellRating, double swellLength, int
                        swellTime, int windSpeed) {
        this.time = time;
        this.startSurfDepth = startSurfDepth;
        this.endSurfDepth = endSurfDepth;
        this.swellRating = swellRating;
        this.swellLength = swellLength;
        this.swellTime = swellTime;
        this.windSpeed = windSpeed;
    }

    public int getTime() {
        return time;
    }

    public int getStartSurfDepth() {
        return startSurfDepth;
    }

    public void setStartSurfDepth(int startSurfDepth) {
        this.startSurfDepth = startSurfDepth;
    }

    public int getEndSurfDepth() {
        return endSurfDepth;
    }

    public void setEndSurfDepth(int endSurfDepth) {
        this.endSurfDepth = endSurfDepth;
    }

    public int getSwellRating() {
        return swellRating;
    }

    public void setSwellRating(int swellRating) {
        this.swellRating = swellRating;
    }

    public double getSwellLength() {
        return swellLength;
    }

    public void setSwellLength(double swellLength) {
        this.swellLength = swellLength;
    }

    public int getSwellTime() {
        return swellTime;
    }

    public void setSwellTime(int swellTime) {
        this.swellTime = swellTime;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
}
