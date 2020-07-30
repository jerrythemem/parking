package com.jerrythemem.parking;

import java.time.LocalTime;
import java.util.*;

public class Parking {

    private ArrayList<CarSlot> carList;
    
    public Parking(int places) {
        carList = new ArrayList<>();
        
        for (int place = 0; place < places; place++) {
            carList.add(new CarSlot("x", "x", LocalTime.now()));
        }
    }

    
    public void addCar(Car newCar) {
        int place = 0;

        for (var slot : carList) {
            if (slot.getCarNumberSlot().equals("x")) {                  
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
            if (slot.getCarNumberSlot().equals("x")) {
                freeSpace++;
            }
        }
        System.out.println("There are " + freeSpace + " free places");
    }


    public void removeCar(String carNumber){
        int place = 0;

        for (var slot : carList) {
            if (!(slot.getCarNumberSlot().equals("x"))) {
                if (carNumber.equals(slot.getCarNumberSlot())) {
                    carList.set(place, new CarSlot("x", "x", LocalTime.now()));
                }
            }

            place++;
        }
        System.out.println("Thanks for visiting");
    }

    public void listOfCars() {
        int place = 0;

        for (var slot : carList) {
            if (!(slot.getCarNumberSlot().equals("x"))) {
                String placeString = Integer.toString(place);
                System.out.println(placeString + " - " + carList.get(place).getCarNumberSlot() + ", " + carList.get(place).getOwnerNameSlot());
            }
            
            place++;
        }
    }

    public void currentCars() {
        for (var slot : carList) {
            if (!(slot.getCarNumberSlot().equals("x"))) {
                System.out.println(slot.getCarNumberSlot() + " - " + slot.getOwnerNameSlot() + " - " + slot.getOccupiedSince());
            }
        }
    }
}
