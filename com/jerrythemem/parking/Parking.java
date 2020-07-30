package com.jerrythemem.parking;

import java.util.*;

public class Parking {
/*
 why is this variable needed?
 */
    private int parkingPlaces;
    private ArrayList<CarSlot> carList;
    
    public Parking(int places) {
        parkingPlaces = places;
        carList = new ArrayList<>();
        
        for (int place = 0; place < parkingPlaces; place++) {
            carList.add(null);
        }
    }

    /*
    this is actual "external" API for parking - and you should not expose slots, cause this is already your implementation details.
    it should accept Car object as parameter.
     */
    public void addCar(CarSlot newCar) {
        int place = 0;

        for (var car : carList) {
            if (car == null) {                  
                carList.set(place, newCar);
                break;
            }

            place++;
        }
        System.out.println("Car added");
    }


    public void freeSpace(){
        int freeSpace = 0;

        /*
        carList means that this lists contains cars, but it contains slots.
        same goes for "var car" - All names should correspond to the actual model you store

         */
        for (var car : carList) {
            if (car == null) {
                freeSpace++;
            }
        }
        System.out.println("There are " + freeSpace + " free places");
    }


    public void removeCar(String carNumber){
        int place = 0;

        for (var car : carList) {
            if (car != null) {
                if (carNumber.equals(car.getCarNumberSlot())) {
                    carList.set(place, null);
                }
            }

            place++;
        }
        System.out.println("Thanks for visiting");
    }

    public void listOfCars() {
        int place = 0;

        for (var car : carList) {
            if (car != null) {
                String placeString = Integer.toString(place);
                System.out.println(placeString + " - " + carList.get(place).getCarNumberSlot() + ", " + carList.get(place).getOwnerNameSlot());
            }
            
            place++;
        }
    }

    public void currentCars() {
        for (var car : carList) {
            if (car != null) {
                System.out.println(car.getCarNumberSlot() + " - " + car.getOwnerNameSlot() + " - " + car.getOccupiedSince());
            }
        }
    }
}
