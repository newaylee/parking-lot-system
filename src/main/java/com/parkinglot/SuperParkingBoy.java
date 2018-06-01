package com.parkinglot;

import java.util.List;

public class SuperParkingBoy extends ParkingBoy {
    public SuperParkingBoy(int id) {
        super(id);
    }

    @Override
    public ParkingLot getPreferredParkingLot() {
        List<ParkingLot> parkingLots = ParkingSystem.getParkingSystem().getParkingLots();
        double bestAvailableRate = 0;
        ParkingLot preferredParkingLot = null;
        for (ParkingLot parkingLot : parkingLots) {
            if (getAvailableRate(parkingLot) > bestAvailableRate) {
                preferredParkingLot = parkingLot;
                bestAvailableRate = getAvailableRate(parkingLot);
            }
        }
        return preferredParkingLot;
    }

    public double getAvailableRate(ParkingLot parkingLot) {
        return ((double) parkingLot.getNumberOfEmptyLot()) / parkingLot.PARKING_CAPACITY;
    }

}
