package com.jerrythemem.parking;

import java.time.LocalTime;
import java.util.*;

public class Parking {

    private ArrayList<CarSlot> carList;
    
    public Parking(int places) {
        carList = new ArrayList<>();
        
        for (int place = 0; place < places; place++) {
            /*
            you can add constructor without arguments not to write null,null,null
             */
            carList.add(new CarSlot(null, null, null));
        }
    }

    
    public void addCar(Car newCar) {
        int place = 0;

        for (var slot : carList) {
            if (slot.getCar() == null) {
                /**
                 * whyyyyyy?
                 * yesterday we discussed that it is not necessary to REPLACE slot every time you park a car. you
                 * should just use setCar
                 */
                carList.set(place, new CarSlot(newCar.getCarNumber(), newCar.getOwnerName(), LocalTime.now()));
                break;
            }

            place++;
        }
        /*
            notifying user should be done by application (MainApp), not the parking
         */
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
                    /*
                    right, why here you did it correctly, just by nullify-ing car on slot, and on parking you did what you did?
                     */
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
                /*
                    notifying user should be done by application (MainApp), not the parking
                 */
                System.out.println(placeString + " - " + slot.getCar().getCarNumber() + ", " + slot.getCar().getOwnerName());
            }
            
            place++;
        }
    }

    public void currentCars() {
        for (var slot : carList) {
            if (slot.getCar() != null) {
                /*
                    notifying user should be done by application (MainApp), not the parking
                 */
                System.out.println(slot.getCarNumberSlot() + " - " + slot.getOwnerNameSlot() + " - " + slot.getOccupiedSince());
            }
        }
    }
}
