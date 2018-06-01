package com.parkinglot;

import java.util.ArrayList;

public class ParkingLot extends Party {
    ArrayList<Lot> lots = new ArrayList<>();
    public final int PARKING_CAPACITY;

    public ParkingLot(int id, int parkingCapacity) {
        super(id);
        PARKING_CAPACITY = parkingCapacity;
        for (int i = 0; i < PARKING_CAPACITY; i++) {
            lots.add(new Lot(i));
        }
    }

    public boolean park(Car car) {
        Lot emptyLot = findEmptyLot();

        if (emptyLot == null) {
            return false;
        } else {
            return emptyLot.park(car);
        }
    }

    Lot findEmptyLot() {
        for (Lot lot : lots) {
            if (lot.isEmpty()) {
                return lot;
            }
        }

        return null;
    }

    public int getNumberOfEmptyLot() {
        return (int) lots.stream().filter(p -> p.isEmpty()).count();
    }
}
