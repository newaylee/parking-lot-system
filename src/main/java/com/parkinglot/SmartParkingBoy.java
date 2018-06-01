package com.parkinglot;

import java.util.List;

public class SmartParkingBoy extends ParkingBoy {
    public SmartParkingBoy(int id) {
        super(id);
    }

    @Override
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

}
