package com.parkinglot;

import org.junit.Assert;
import org.junit.Test;

public class LotTest {

    @Test
    public void getNumberOfParkingLot() {
        Assert.assertEquals(0,new Lot().getNumberOfParkingLot());
    }
}