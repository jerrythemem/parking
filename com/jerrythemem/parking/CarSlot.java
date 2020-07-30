package com.jerrythemem.parking;

import java.time.LocalTime;

public class CarSlot {

    private Car car;
    private LocalTime occupiedSince;

    public CarSlot(String newCarNumber, String newOwnerName) {
        setCar(new Car(newCarNumber, newOwnerName));
        setOccupiedSince(occupiedSince);
    }

    /*
    What exactly are you trying to do here? by the method name I can guess that you can generally return the occupiedSince....
     */
    public LocalTime getOccupiedSince() {
        LocalTime occupiedTime = LocalTime.now().minusHours(occupiedSince.getHour()).minusMinutes(occupiedSince.getMinute()).
        minusSeconds(occupiedSince.getSecond()).minusNanos(occupiedSince.getNano());
        return occupiedTime;
    }
/*
Why to set occupiedSince separately? when you are assigning the car to this slot, you can initialize it at same time

 */
    public void setOccupiedSince(LocalTime occupiedSince) {
        this.occupiedSince = occupiedSince;
    }

    public Car getCar() {
        return car;
    }

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
