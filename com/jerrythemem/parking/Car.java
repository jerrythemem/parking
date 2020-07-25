package com.jerrythemem.parking;
public class Car {
    private String carNumber;
    private String ownerName;

    public Car(String newCarNumber, String newOwnerName) {
        setCarNumber(newCarNumber);
        setOwnerName(newOwnerName);
    }

    public void setCarNumber(String newCarNumber) {
        this.carNumber = newCarNumber;
    }

    public void setOwnerName(String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
}