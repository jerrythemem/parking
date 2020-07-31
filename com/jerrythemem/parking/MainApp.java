package com.jerrythemem.parking;

import java.util.*;

class MainApp {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        Scanner inpLine = new Scanner(System.in);

        System.out.println("Hi, please type number of parking places: ");
        int myPlaces = inp.nextInt();
        Parking myParking = new Parking(myPlaces);

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
                Car newCar = new Car(number, name);
                myParking.addCar(newCar);
                System.out.println("Car added");
                
                
            } else if (command.equals("freeSpace")) {
                System.out.println(myParking.freeSpace());
                
                
            } else if (command.equals("removeCar")) {
                if (myParking.currentCars() == "There are no cars in parking") {
                    System.out.println("There are no cars in parking");
                
                } else {
                    System.out.println("Here are current cars in parking: ");
                    System.out.println(myParking.currentCars());

                    System.out.println("Enter a car number");
                    String number = inpLine.nextLine();

                    if (myParking.removeCar(number)) {
                        System.out.println("Thanks for visiting");
                    } else {
                        System.out.println("There are no cars with this car number");
                    }
                }
                
                
            } else if (command.equals("listOfCars")) {
                System.out.println(myParking.listOfCars());
                
                
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
