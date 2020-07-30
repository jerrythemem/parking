package com.jerrythemem.parking;

import java.util.*;

public class Parking {

    private int parkingPlaces;
    private ArrayList<CarSlot> carList;
    
    public Parking(int places) {
        parkingPlaces = places;
        carList = new ArrayList<>();
    }


    public void newParking() {
        for (int place = 0; place < parkingPlaces; place++) {
            carList.add(null);
        }
    }


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