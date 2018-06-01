package com.parkinglot;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingBoyTest {

    @Test
    public void getPreferredParkingLot() {
        ParkingSystem parkingSystem = ParkingSystem.getParkingSystem();
        parkingSystem.addParkingLot(new ParkingLot(1, 5));
        parkingSystem.addParkingLot(new ParkingLot(2, 10));
        parkingSystem.addParkingLot(new ParkingLot(3, 6));

        ParkingBoy parkingBoy = new ParkingBoy(1);
        Assert.assertEquals(2, parkingBoy.getPreferredParkingLot().getId());
    }
}