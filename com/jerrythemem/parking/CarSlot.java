package com.jerrythemem.parking;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CarSlot {

    private Car car;
    private LocalTime occupiedSince;

    public CarSlot(String newCarNumber, String newOwnerName, LocalTime newOccupiedSince) {
        setCar(new Car(newCarNumber, newOwnerName));
        occupiedSince = newOccupiedSince;
    }


    public long getOccupiedSince() {
        long occupiedTime = ChronoUnit.MINUTES.between(occupiedSince, LocalTime.now());
        return occupiedTime;
    }


    public Car getCar() {
        return car;
    }

    /*
    Here you are not initalizing the occupiedSince...
     */
    public void setCar(Car car) {
        this.car = car;
    }

    public String getCarNumberSlot() {
        return car.getCarNumber();
    }

    public String getOwnerNameSlot() {
        return car.getOwnerName();
    }
}
