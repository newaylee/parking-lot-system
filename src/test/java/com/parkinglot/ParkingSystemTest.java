package com.parkinglot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingSystemTest {

    @Test
    public void getParkingLotById() {
        ParkingSystem parkingSystem = new ParkingSystem();
        parkingSystem.addParkingLot(new ParkingLot(1,2));
        parkingSystem.addParkingLot(new ParkingLot(2,5));
        Assert.assertEquals(1, parkingSystem.getParkingLotById(1).getId());
        Assert.assertEquals(2, parkingSystem.getParkingLotById(2).getId());
        Assert.assertEquals(null, parkingSystem.getParkingLotById(3));
    }
}