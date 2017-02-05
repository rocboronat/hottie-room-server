package com.fewlaps.hottieroom.server;

public class Repository {

    private static final int INVALID_VALUE = -42;

    private double actualTemperature = INVALID_VALUE;
    private int desiredTemperature = INVALID_VALUE;

    public double getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public int getDesiredTemperature() {
        return desiredTemperature;
    }

    public void setDesiredTemperature(int desiredTemperature) {
        this.desiredTemperature = desiredTemperature;
    }
}
