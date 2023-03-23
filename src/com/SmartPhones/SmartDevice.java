package com.SmartPhones;

public class SmartDevice {
    int height;
    int width;
    int screenInches;
    int batteryLife;

    public SmartDevice(){}
    public SmartDevice(int height, int width, int screenInches, int batteryLife ){
        this.height = height;
        this.width = width;
        this.screenInches = screenInches;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Altura: " + height + " width: " + width + " screenInches: " + screenInches + " batteryLife: " + batteryLife;
    }
}
