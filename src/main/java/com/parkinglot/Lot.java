package com.parkinglot;

public class Lot extends Party {

    Car car = null;

    public boolean isEmpty() {
        return car == null;
    }

    public boolean park(Car car) {
        if (isEmpty()) {
            this.car = car;
            return true;
        } else {
            return false;
        }
    }

    public Car getCar() {
        return car;
    }

    public Car pickCar() {
        Car car = getCar();
        this.car = null;
        return car;
    }

    public Lot(int id) {
        super(id);
    }
}
