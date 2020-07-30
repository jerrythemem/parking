package com.jerrythemem.parking;

import java.time.LocalTime;
import java.util.*;

public class Parking {

    private ArrayList<CarSlot> carList;
    
    public Parking(int places) {
        carList = new ArrayList<>();
        
        for (int place = 0; place < places; place++) {
            carList.add(new CarSlot(null, null, null));
        }
    }

    
    public void addCar(Car newCar) {
        int place = 0;

        for (var slot : carList) {
            if (slot.getCar() == null) {                  
                carList.set(place, new CarSlot(newCar.getCarNumber(), newCar.getOwnerName(), LocalTime.now()));
                break;
            }

            place++;
        }
        System.out.println("Car added");
    }


    public void freeSpace(){
        int freeSpace = 0;

        for (var slot : carList) {
            if (slot.getCar() == null) {
                freeSpace++;
            }
        }
        System.out.println("There are " + freeSpace + " free places");
    }


    public void removeCar(String carNumber){

        for (var slot : carList) {
            if (slot.getCar() != null) {
                if (carNumber.equals(slot.getCarNumberSlot())) {
                    slot.setCar(null);
                }
            }
        }
        System.out.println("Thanks for visiting");
    }

    public void listOfCars() {
        int place = 0;

        for (var slot : carList) {
            if (slot.getCar() != null) {
                String placeString = Integer.toString(place);
                System.out.println(placeString + " - " + slot.getCar().getCarNumber() + ", " + slot.getCar().getOwnerName());
            }
            
            place++;
        }
    }

    public void currentCars() {
        for (var slot : carList) {
            if (slot.getCar() != null) {
                System.out.println(slot.getCarNumberSlot() + " - " + slot.getOwnerNameSlot() + " - " + slot.getOccupiedSince());
            }
        }
    }
}
