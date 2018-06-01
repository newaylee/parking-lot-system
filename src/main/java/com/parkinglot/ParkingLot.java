package com.parkinglot;

import java.util.ArrayList;

public class ParkingLot extends Party {
    ArrayList<Lot> lots = new ArrayList<>();

    public ParkingLot(int id) {
        super(id);
    }


    public int getNumberOfEmptyLot(){
        return 0;
    }
}
