package com.jerrythemem.parking;

import java.util.*;

/*ПАРКОВКА:
    Парковочные места (+ названия) - complete
    Взаимодействие с машинами*/
public class Parking {
    public static HashMap<String, String> carPlaces = new HashMap<String, String>();

    public static void myParking(int parkingPlaces) {
        for (int place = 0; place < parkingPlaces; place++) {
            String placeString = Integer.toString(place);
            placeString = "PP" + placeString;
            carPlaces.put(placeString, null);
        }   
    }


    public static void addCar(String carNumber, int parkingPlaces) {
        for (int place = 0; place < parkingPlaces; place++) {
            String placeString = Integer.toString(place);
            placeString = "PP" + placeString;
            if (carPlaces.get(placeString) == null) {                  
                carPlaces.put(placeString, carNumber);
                break;
            }
        }
        System.out.println("Car added");
    }


    public static void freeSpace(int parkingPlaces){
        int freeSpace = 0;

        for (int place = 0; place < parkingPlaces; place++) {
            String placeString = Integer.toString(place);
            placeString = "PP" + placeString;
            if (carPlaces.get(placeString) == null) {
                freeSpace++;
            }
        }
        System.out.println("There are " + freeSpace + " free places");
    }


    public static void removeCar(String carNumber, int parkingPlaces){
        for (int place = 0; place < parkingPlaces; place++) {
            String placeString = Integer.toString(place);
            placeString = "PP" + placeString;
            if (carNumber.equals(carPlaces.get(placeString))) {
                carPlaces.put(placeString, null);
            }
        }
        System.out.println("Thanks for visiting");
    }
}