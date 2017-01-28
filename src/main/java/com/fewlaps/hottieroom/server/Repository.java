package com.fewlaps.hottieroom.server;

public class Repository {

    private static final int INVALID_VALUE = -42;

    private double actualTemperature = INVALID_VALUE;
    private double desiredTemperature = INVALID_VALUE;

    public double getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public double getDesiredTemperature() {
        return desiredTemperature;
    }

    public void setDesiredTemperature(double desiredTemperature) {
        this.desiredTemperature = desiredTemperature;
    }
}
