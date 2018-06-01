package com.parkinglot;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {

    @Test
    public void get_parking_lot_capacity() {
        Assert.assertEquals(1, new ParkingLot(1, 1).PARKING_CAPACITY);
    }

    @Test
    public void should_get_correct_num_of_empty_lot() {
        final int CAPICITY = 5;
        ParkingLot parkingLot = new ParkingLot(1, CAPICITY);
        Assert.assertEquals(CAPICITY, parkingLot.getNumberOfEmptyLot());
        parkingLot.park(new Car(1));
        Assert.assertEquals(CAPICITY - 1, parkingLot.getNumberOfEmptyLot());

    }

    @Test
    public void should_return_true_when_park_is_available() {
        final int CAPACITY = 3;
        ParkingLot parkingLot = new ParkingLot(1, CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            Assert.assertEquals(true, parkingLot.park(new Car(i)));
        }
    }

    @Test
    public void should_return_false_when_park_is_full() {
        final int CAPACITY = 3;
        ParkingLot parkingLot = new ParkingLot(1, CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            parkingLot.park(new Car(i));
        }

        Assert.assertEquals(false, parkingLot.park(new Car(CAPACITY + 1)));

    }

    @Test
    public void should_get_boy_id() {
        ParkingBoy boy = new ParkingBoy(9);
        Assert.assertEquals(9, boy.getId());
    }


}