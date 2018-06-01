package com.parkinglot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SmartParkingBoyTest {
    @Before
    public void setup_parkingSystem() {
        ParkingSystem parkingSystem = ParkingSystem.getParkingSystem();
        parkingSystem.addParkingLot(new ParkingLot(1, 5));
        parkingSystem.addParkingLot(new ParkingLot(2, 10));
        parkingSystem.addParkingLot(new ParkingLot(3, 6));
    }

    @Test
    public void should_get_most_available_parking_lot() {
        ParkingBoy parkingBoy = new SmartParkingBoy(1);
        Assert.assertEquals(2, parkingBoy.getPreferredParkingLot().getId());
    }
}