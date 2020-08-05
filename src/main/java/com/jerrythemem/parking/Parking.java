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


    public boolean removeCar(String carNumber){
        boolean remove = false;

        for (var slot : carList) {
            if (slot.getCar() != null) {
                if (carNumber.equals(slot.getCarNumberSlot())) {
                    slot.setCar(null);
                    remove = true;
                }
            }
        }

        return remove;
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

        if (!condition.equals("")) {
            return condition;
        } else {
            return "There are no cars in parking";
        }
    }

    public String currentCars() {
        String condition = "";

        for (var slot : carList) {
            if (slot.getCar() != null) {
                condition += slot.getCarNumberSlot() + " - " + slot.getOwnerNameSlot() + " - " + slot.getOccupiedSince() + "\n";
            }
        }

        if (!condition.equals("")) {
            return condition;
        } else {
            return "There are no cars in parking";
        }
    }
}
