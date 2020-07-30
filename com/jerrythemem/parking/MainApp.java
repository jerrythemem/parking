package com.jerrythemem.parking;

import java.time.LocalTime;
import java.util.*;

class MainApp {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        Scanner inpLine = new Scanner(System.in);

        System.out.println("Hi, please type number of parking places: ");
        int myPlaces = inp.nextInt();
        Parking myParking = new Parking(myPlaces);
        myParking.newParking();

        System.out.println("Enter a command (for list of commands type 'help')");
        while (true) {
            String command = inpLine.nextLine();

            if (command.equals("help")) {
                System.out.println("addCar - make new car and add to parking");
                System.out.println("freeSpace - calculate free space in parking");
                System.out.println("removeCar - removes car from parking");
                System.out.println("listOfCars - displays currnet cars in parking");
                System.out.println("close - close parking");
            
            
            } else if (command.equals("addCar")) {
                System.out.println("Enter car number and owner name separated by enter");
                String number = inpLine.nextLine();
                String name = inpLine.nextLine();
                CarSlot newCar = new CarSlot(number, name);
                myParking.addCar(newCar);

                newCar.setOccupiedSince(LocalTime.now());
                System.out.println(newCar.getOccupiedSince());
                
                
            } else if (command.equals("freeSpace")) {
                myParking.freeSpace();
                
                
            } else if (command.equals("removeCar")) {
                System.out.println("Here are current cars in parking: ");
                myParking.currentCars();
                System.out.println("Enter a car number");
                String number = inpLine.nextLine();
                myParking.removeCar(number);
                
                
            } else if (command.equals("listOfCars")) {
                myParking.listOfCars();
                
                
            } else if (command.equals("close")) {
                System.out.println("Thanks for work");
                break;
            
            
            } else {
                System.out.println("Sorry, wrong command");
            }


            System.out.println("\nWhat's next?");
        }

        
        inpLine.close();
        inp.close();
    }
}