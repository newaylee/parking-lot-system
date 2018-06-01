package com.parkinglot;

import java.util.ArrayList;

public class ParkingSystem {
    private static ParkingSystem parkingSystemSingleton = null;

    public static ParkingSystem getParkingSystem() {
        if (parkingSystemSingleton == null) {
            parkingSystemSingleton = new ParkingSystem();
        }

        return parkingSystemSingleton;
    }

    protected ParkingSystem() {}

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
