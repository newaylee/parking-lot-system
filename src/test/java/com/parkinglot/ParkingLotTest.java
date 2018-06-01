package com.parkinglot;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {

    @Test
    public void getNumberOfParkingLot() {
        Assert.assertEquals(1,new ParkingLot(1, 1).PARKING_CAPACITY);
    }

    @Test
    public void should_get_boy_id() {
        ParkingBoy boy = new ParkingBoy(9);
        Assert.assertEquals(9,boy.getId());
    }

}