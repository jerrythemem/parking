package com.jerrythemem.parking;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parking {

    private final ArrayList<CarSlot> carList;
    private static final Logger logger = LoggerFactory.getLogger(Parking.class);
    
    public Parking(int places) {
        carList = new ArrayList<>();
        
        for (int place = 0; place < places; place++) {
            carList.add(new CarSlot());
        }

        logger.info("Parking with {} places has been created", places);
    }

    
    public void addCar(Car newCar) {

        for (var slot : carList) {
            if (slot.getCar() == null) {
                slot.setCar(newCar);
                break;
            }
        }

        logger.info("Car {} has been added", newCar.getCarNumber());
    }


    public String freeSpace(){
        int freeSpace = 0;

        for (var slot : carList) {
            if (slot.getCar() == null) {
                freeSpace++;
            }
        }

        return "There are " + freeSpace + " free places";
    }


    public boolean removeCar(String carNumber){
        boolean remove = false;

        for (var slot : carList) {
            if (slot.getCar() != null) {
                if (carNumber.equals(slot.getCarNumberSlot())) {
                    slot.setCar(null);
                    remove = true;
                }
            }
        }

        if (remove) {
            logger.info("Car {} has been removed", carNumber);
        }

        return remove;
    }

    public String listOfCars() {
        int place = 0;
        StringBuilder condition = new StringBuilder();

        for (var slot : carList) {
            if (slot.getCar() != null) {
                String placeString = Integer.toString(place);
                condition.append(placeString).append(" - ").append(slot.getCar().getCarNumber()).append(", ").
                        append(slot.getCar().getOwnerName()).append("\n");
            }
            
            place++;
        }

        if (!condition.toString().equals("")) {
            return condition.toString();
        } else {
            return "There are no cars in parking";
        }
    }

    public String currentCars() {
        StringBuilder condition = new StringBuilder();

        for (var slot : carList) {
            if (slot.getCar() != null) {
                condition.append(slot.getCarNumberSlot()).append(" - ").append(slot.getOwnerNameSlot()).append(" - ").
                        append(slot.getOccupiedSince()).append("\n");
            }
        }

        if (!condition.toString().equals("")) {
            return condition.toString();
        } else {
            return "There are no cars in parking";
        }
    }

    public void close() {
        logger.info("Parking has been closed");
    }
}
