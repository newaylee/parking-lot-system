package com.parkinglot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingBoyTest {

    @Before
    public void setup_parkingSystem() {
        ParkingSystem parkingSystem = ParkingSystem.getParkingSystem();
        ParkingLot parkingLot1 = new ParkingLot(1, 6);
        ParkingLot parkingLot2 = new ParkingLot(2, 10);
        ParkingLot parkingLot3 = new ParkingLot(3, 5);

        parkingSystem.addParkingLot(parkingLot1);
        parkingSystem.addParkingLot(parkingLot2);
        parkingSystem.addParkingLot(parkingLot3);

        int carIdSeqNum = 10000;

        parkingLot1.park(new Car(carIdSeqNum++));
        parkingLot1.park(new Car(carIdSeqNum++));
        parkingLot2.park(new Car(carIdSeqNum++));
        parkingLot2.park(new Car(carIdSeqNum++));
        parkingLot2.park(new Car(carIdSeqNum++));
        parkingLot2.park(new Car(carIdSeqNum++));
        parkingLot2.park(new Car(carIdSeqNum++));
        parkingLot3.park(new Car(carIdSeqNum++));
    }

    @Test
    public void should_get_first_available_parking_lot() {
        ParkingBoy parkingBoy = new ParkingBoy(1);
        Assert.assertEquals(1, parkingBoy.getPreferredParkingLot().getId());
    }

    @Test
    public void should_parking_boy_park_car_successfully() {
        ParkingBoy parkingBoy = new ParkingBoy(1);
        Car car = new Car(123);
        parkingBoy.park(car);
        ParkingSystem parkingSystem = ParkingSystem.getParkingSystem();
        Assert.assertNotNull(parkingSystem.findCarParkedParkingLot(123));
    }

    @Test
    public void should_parking_boy_pick_car_successfully() {
        ParkingBoy parkingBoy = new ParkingBoy(1);
        Car car = new Car(123);
        parkingBoy.park(car);
        ParkingSystem parkingSystem = ParkingSystem.getParkingSystem();

        Assert.assertNotNull(parkingSystem.findCarParkedParkingLot(123));
        Assert.assertNotNull(parkingBoy.pick(123));
    }



    @Test
    public void should_smart_get_most_available_parking_lot() {
        ParkingBoy parkingBoy = new SmartParkingBoy(1);
        Assert.assertEquals(2, parkingBoy.getPreferredParkingLot().getId());
    }


    @Test
    public void should_super_get_most_available_parking_lot() {
        ParkingBoy parkingBoy = new SuperParkingBoy(1);
        Assert.assertEquals(3, parkingBoy.getPreferredParkingLot().getId());

    }

    @Test
    public void should_parking_manager_assign_parking_boy_successfully() {
        ParkingSystem parkingSystem = ParkingSystem.getParkingSystem();
        Car car = new Car(111);
        ParkingBoy manager = new ParkingManager(999);
        ParkingBoy boy = new ParkingBoy(1);
        ((ParkingManager) manager).addSubordinate(boy);
        ((ParkingManager) manager).park(car, 1);
        Assert.assertEquals(3, parkingSystem.getParkingLotById(1).getNumberOfEmptyLot());

    }
}