package com.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager extends ParkingBoy {
    private List<ParkingBoy> subordinates = new ArrayList<>();

    public void addSubordinate(ParkingBoy subordinate) {
        this.subordinates.add(subordinate);
    }

    public boolean park(Car car, int parkingBoyId) {
        ParkingBoy parkingBoy = subordinates.stream().filter((ParkingBoy p) -> { return p.getId() == parkingBoyId; }).findAny().orElse(null);
        return getPreferredParkingLot().park(car);
    }

    public ParkingManager(int id) {
        super(id);
    }


}
