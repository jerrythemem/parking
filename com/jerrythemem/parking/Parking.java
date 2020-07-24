package com.jerrythemem.parking;

import java.util.*;

public class Parking {

    private int parkingPlaces;
    private HashMap<Integer, String> carPlaces;
    HashMap<String, String> carList;
    
    public Parking(int places) {
        parkingPlaces = places;
        carPlaces = new HashMap<>();
        carList = new HashMap<>();
    }


    public void newParking() {
        for (int place = 0; place < parkingPlaces; place++) {
            carPlaces.put(place, null);
        }   
    }


    public void addCar(String carNumber) {
        for (int place = 0; place < parkingPlaces; place++) {
            if (carPlaces.get(place) == null) {                  
                carPlaces.put(place, carNumber);
                break;
            }
        }
        System.out.println("Car added");
    }


    public void freeSpace(){
        int freeSpace = 0;

        for (int place = 0; place < parkingPlaces; place++) {
            if (carPlaces.get(place) == null) {
                freeSpace++;
            }
        }
        System.out.println("There are " + freeSpace + " free places");
    }


    public void removeCar(String carNumber){
        for (int place = 0; place < parkingPlaces; place++) {
            if (carNumber.equals(carPlaces.get(place))) {
                carPlaces.put(place, null);
            }
        }
        System.out.println("Thanks for visiting");
    }

    public void listOfCars() {
        for(int place = 0; place < parkingPlaces; place++) {
            if (carPlaces.get(place) != null) {
                String placeString = Integer.toString(place);
                System.out.println(placeString + " - " + carPlaces.get(place));
            }
        }
    }

    public void currentCars() {
        for (var key : carList.keySet()) {
            System.out.println(key + " - " + carList.get(key));
        }
    }
}