package com.parkinglot;

import java.util.ArrayList;

public class ParkingSystem {
    ArrayList<ParkingLot> parkingLots = new ArrayList<>();

    public void addParkingLot(ParkingLot parkingLot) {
        if (!parkingLots.contains(parkingLot)) {
            parkingLots.add(parkingLot);
        }
    }

    public ParkingLot getParkingLotById(int parkingLotId){
        return parkingLots.stream()
                .filter(p -> p.getId() == parkingLotId)
                .findAny()
                .orElse(null);
    }
}
