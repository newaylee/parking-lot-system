package com.parkinglot;

import java.util.List;

public class ParkingBoy extends Party{

    public ParkingBoy(int id) {
        super(id);
    }

    public ParkingLot getPreferredParkingLot() {
        List<ParkingLot> parkingLots = ParkingSystem.getParkingSystem().getParkingLots();
        ParkingLot preferredParkingLot = parkingLots.get(0);
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.getNumberOfEmptyLot() > preferredParkingLot.getNumberOfEmptyLot()) {
                preferredParkingLot = parkingLot;
            }
        }
        return preferredParkingLot;
    }

    public boolean park(Car car) {
        return getPreferredParkingLot().park(car);
    }
}
