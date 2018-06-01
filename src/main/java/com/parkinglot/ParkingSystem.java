package com.parkinglot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParkingSystem {
    private static ParkingSystem parkingSystemSingleton = null;
    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();



    public static ParkingSystem getParkingSystem() {
        if (parkingSystemSingleton == null) {
            parkingSystemSingleton = new ParkingSystem();
        }

        return parkingSystemSingleton;
    }

    protected ParkingSystem() {}

    public void addParkingLot(ParkingLot parkingLot) {
        if (!parkingLots.contains(parkingLot)) {
            parkingLots.add(parkingLot);
        }
    }

    public List<ParkingLot> getParkingLots() {
        return Collections.unmodifiableList(parkingLots);
    }

    public ParkingLot getParkingLotById(int parkingLotId){
        return parkingLots.stream()
                .filter(p -> p.getId() == parkingLotId)
                .findAny()
                .orElse(null);
    }

    public ParkingLot findCarParkedParkingLot(int carId) {
        return parkingLots.stream()
                .filter(p -> p.isCarInThisParkingLot(carId))
                .findAny()
                .orElse(null);
    }

}
