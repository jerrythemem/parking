package com.jerrythemem.parking;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CarSlot {

    private Car car;
    private LocalTime occupiedSince;

    public CarSlot() {
        
    }

    public CarSlot(String newCarNumber, String newOwnerName, LocalTime newOccupiedSince) {
        if (newCarNumber != null && newOwnerName != null) {
            setCar(new Car(newCarNumber, newOwnerName));
        }
        occupiedSince = newOccupiedSince;
    }


    public long getOccupiedSince() {
        return ChronoUnit.MINUTES.between(occupiedSince, LocalTime.now());
    }


    public Car getCar() {
        return car;
    }


    public void setCar(Car car) {
        this.car = car;
        this.occupiedSince = LocalTime.now();

        if (car == null) {
            this.occupiedSince = null;
        }
    }

    public String getCarNumberSlot() {
        return car.getCarNumber();
    }

    public String getOwnerNameSlot() {
        return car.getOwnerName();
    }
}
