package com.jerrythemem.parking;

import java.util.*;

public class Parking {

    public HashMap<Integer, String> carPlaces = new HashMap<Integer, String>();
    public HashMap<String, String> carList = new HashMap<String, String>(); 

    int parkingPlaces = 0;

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