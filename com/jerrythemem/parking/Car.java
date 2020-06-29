package com.jerrythemem.parking;

import java.util.HashMap;

//import java.util.*;

/*АВТОМОБИЛЬ:
    Номер (+ имя владельца)
    Взаимодействие с парковкой */
public class Car {
    public static HashMap<String, String> cars = new HashMap<String, String>();
    
    public static void newCar(String carNumber, String name){
        cars.put(carNumber, name);
        System.out.println("Car recently added");
    }

    public static void listOfCars(){
        for (String car : cars.keySet()) {
            System.out.println(car + " - " + cars.get(car));
        }
    }
}