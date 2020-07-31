package com.jerrythemem.parking;

import java.util.*;

public class Parking {

    private ArrayList<CarSlot> carList;
    
    public Parking(int places) {
        carList = new ArrayList<>();
        
        for (int place = 0; place < places; place++) {
            carList.add(new CarSlot());
        }
    }

    
    public void addCar(Car newCar) {

        for (var slot : carList) {
            if (slot.getCar() == null) {
                slot.setCar(newCar);
                break;
            }
        }
    }


    public String freeSpace(){
        int freeSpace = 0;

        for (var slot : carList) {
            if (slot.getCar() == null) {
                freeSpace++;
            }
        }
        return "There are " + freeSpace + " free places";
    }


    public void removeCar(String carNumber){

        for (var slot : carList) {
            if (slot.getCar() != null) {
                if (carNumber.equals(slot.getCarNumberSlot())) {
                    slot.setCar(null);
                }
            }
        }
    }

    public String listOfCars() {
        int place = 0;
        String condition = "";

        for (var slot : carList) {
            if (slot.getCar() != null) {
                String placeString = Integer.toString(place);
                condition += placeString + " - " + slot.getCar().getCarNumber() + ", " + slot.getCar().getOwnerName() + "\n";
            }
            
            place++;
        }
        return condition;
    }

    public String currentCars() {
        String condition = "";

        for (var slot : carList) {
            if (slot.getCar() != null) {
                condition += slot.getCarNumberSlot() + " - " + slot.getOwnerNameSlot() + " - " + slot.getOccupiedSince() + "\n";
            }
        }

        return condition;
    }
}
