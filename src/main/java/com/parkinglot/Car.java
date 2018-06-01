package com.parkinglot;

public class Car extends Party{
    private String license;

    public Car(int id) {
        super(id);
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
