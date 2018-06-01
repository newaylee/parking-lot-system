package com.parkinglot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingBoyTest {

    @Before
    public void setup_parkingSystem() {
        ParkingSystem parkingSystem = ParkingSystem.getParkingSystem();
        parkingSystem.addParkingLot(new ParkingLot(1, 5));
        parkingSystem.addParkingLot(new ParkingLot(2, 10));
        parkingSystem.addParkingLot(new ParkingLot(3, 6));
    }

    @Test
    public void getPreferredParkingLot() {
        ParkingBoy parkingBoy = new ParkingBoy(1);
        Assert.assertEquals(2, parkingBoy.getPreferredParkingLot().getId());
    }
}