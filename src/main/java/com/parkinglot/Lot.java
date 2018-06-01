package com.parkinglot;

public class Lot extends Party{

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

    public Lot(int id) {
        super(id);
    }
}
