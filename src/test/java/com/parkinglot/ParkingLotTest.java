package com.parkinglot;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {

    @Test
    public void getNumberOfParkingLot() {
        Assert.assertEquals(0,new ParkingLot().getNumberOfParkingLot());
    }
}