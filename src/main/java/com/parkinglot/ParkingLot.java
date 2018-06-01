package com.parkinglot;

import java.util.ArrayList;

public class ParkingLot extends Party {
    ArrayList<Lot> lots = new ArrayList<>();
    public final int PARKING_CAPACITY;

    public ParkingLot(int id, int parkingCapacity) {
        super(id);
        PARKING_CAPACITY = parkingCapacity;
        for (int i=0; i<PARKING_CAPACITY; i++) {
            lots.add(new Lot(i));
        }
    }

    public boolean park(Car car) {
        if (lots.size() >= PARKING_CAPACITY) {
            return false;
        } else {

            return true;
        }
    }

    Lot findEmptyLot() {
        return lots.stream()
                .filter(p -> p.isEmpty())
                .findAny()
                .get();
    }

    public int getNumberOfEmptyLot(){
        return 0;
    }
}
