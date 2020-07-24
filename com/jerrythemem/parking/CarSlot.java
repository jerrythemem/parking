package com.jerrythemem.parking;

import java.time.LocalDateTime;

public class CarSlot {

    private Car car;
    private LocalDateTime occupiedSince;

    public CarSlot(String newCarNumber, String newOwnerName) {
        setCar(new Car(newCarNumber, newOwnerName));
        setOccupiedSince(occupiedSince);
    }

    public LocalDateTime getOccupiedSince() {
        return occupiedSince;
    }

    public void setOccupiedSince(LocalDateTime occupiedSince) {
        this.occupiedSince = occupiedSince;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}