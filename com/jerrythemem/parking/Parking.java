package com.jerrythemem.parking;

import java.util.*;


// I suggest you to add class CarSlot {car: Car, occupiedSince: LocalDateTime }
// this will allow you to do many things later and you can get rid of some of your maps
// Actually can you explain - WHY you implemented these as maps? What is your rationale here?
public class Parking {

    // You can drop generics after HashMap and just specify it like new HashMap<>();
    // exposing internal structure as public variable is bad idea here (and generally)
    // some idiot can decide that he can do something like myParking.carPlaces = new HashMap<>()
    // and this will destroy whole data structure. Other issue that someone can decide to build some additional
    // logic around your variables. and if you later will change these two, then someone elses code can break
    // You should always expose MINIMUM API, so others can use your class and you can be sure that that you can
    // change implementation details without affecting someone elses code
    public HashMap<Integer, String> carPlaces = new HashMap<Integer, String>();
    public HashMap<String, String> carList = new HashMap<String, String>(); 

    int parkingPlaces = 0;

    // See MainApp comments
    public void newParking() {
        for (int place = 0; place < parkingPlaces; place++) {
            carPlaces.put(place, null);
        }   
    }

    // I see that you are using different methods to iterate through collections
    // Collections API should generally be your bible (and as I said before - Kamasutra :)))) )
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
