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

        commandInput:
        while (true) {
            String command = inpLine.nextLine();

            switch (command) {
                case "help":
                    System.out.println("addCar - make new car and add to parking");
                    System.out.println("freeSpace - calculate free space in parking");
                    System.out.println("removeCar - removes car from parking");
                    System.out.println("listOfCars - displays current cars in parking");
                    System.out.println("close - close parking");


                    break;
                case "addCar":
                    System.out.println("Enter car number and owner name separated by enter");
                    String number = inpLine.nextLine();
                    String name = inpLine.nextLine();
                    Car newCar = new Car(number, name);
                    myParking.addCar(newCar);
                    System.out.println("Car added");


                    break;
                case "freeSpace":
                    System.out.println(myParking.freeSpace());


                    break;
                case "removeCar":
                    if (myParking.currentCars().equals("There are no cars in parking")) {
                        System.out.println("There are no cars in parking");

                    } else {
                        System.out.println("Here are current cars in parking: ");
                        System.out.println(myParking.currentCars());

                        System.out.println("Enter a car number");
                        number = inpLine.nextLine();

                        if (myParking.removeCar(number)) {
                            System.out.println("Thanks for visiting");
                        } else {
                            System.out.println("There are no cars with this car number");
                        }
                    }


                    break;
                case "listOfCars":
                    System.out.println(myParking.listOfCars());


                    break;
                case "close":
                    myParking.close();
                    System.out.println("Thanks for work");
                    break commandInput;


                default:
                    System.out.println("Sorry, wrong command");
                    break;
            }


            System.out.println("\nWhat's next?");
        }


        inpLine.close();
        inp.close();
    }
}
