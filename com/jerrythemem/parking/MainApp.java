package com.jerrythemem.parking;

import java.util.*;

class MainApp {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        Scanner inpLine = new Scanner(System.in);

        System.out.println("Hi, please type number of parking places: ");
        int parkingPlaces = inp.nextInt();
        Parking.myParking(parkingPlaces);

        System.out.println("Opening parking... For list of commands type 'help' ");
        String command = inpLine.nextLine();

        while (true) {
            

            if (command.equals("help")) {
                System.out.println("newCar - write your car in list");
                System.out.println("addCar - add your car in parking place");
                System.out.println("freeSpace - show you count of free space");
                System.out.println("removeCar - remove car from parking");
                System.out.println("exit - close parking");
                System.out.println("listOfCars - shows active cars");
        
        
            } else if (command.equals("newCar")) {
                System.out.println("Enter your car number and name, separated by enter");
                String carNumber = inpLine.nextLine();
                String name = inpLine.nextLine();
                Car.newCar(carNumber, name);
        
        
            } else if (command.equals("addCar")) {
                System.out.println("Enter your car number");
                String carNumber = inpLine.nextLine();
                Parking.addCar(carNumber, parkingPlaces);
        
        
            } else if (command.equals("freeSpace")) {
                Parking.freeSpace(parkingPlaces);
        
        
            } else if (command.equals("removeCar")) {
                System.out.println("Enter your car number");
                String carNumber = inpLine.nextLine();
                Parking.removeCar(carNumber, parkingPlaces);
        
        
            } else if (command.equals("exit")) {
                System.out.println("Thanks for work");
                break;
            
            
            } else if (command.equals("listOfCars")) {
                Car.listOfCars();
            }
            
            System.out.println("What's next?");
            command = inpLine.nextLine();
        }

        inpLine.close();
        inp.close();
    }
}