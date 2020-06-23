package com.jerrythemem.parking;

import java.util.*;

class MainApp {
    
    public static void main(String[] args) {
        
        int parkingPlaces = 10;
        Map<Integer, String> cars = new HashMap<Integer, String>();
        
        for (int elem = 0; elem < parkingPlaces; elem++) {
            cars.put(elem, null);
        }

        

        Scanner inp = new Scanner (System.in);
        System.out.println("Open parking: (y or n)");
        String open = inp.nextLine();
        
        if (open.equals("n")) {
            System.out.println("See you next time");
        
        
        } else if (open.equals("y")) {
            
            while (true) {
            System.out.println("Choose command: newCar, freeSpace, leaveCar, exit");
            String command = inp.nextLine();
            
            
            
            if (command.equals("newCar")) {
                System.out.println("Adding new car... Type car number:");
                String carNumber = inp.nextLine();
                for (int carPlace = 0; carPlace < parkingPlaces; carPlace++) {
                    if (cars.get(carPlace) == null) {                       
                        cars.put(carPlace, carNumber);
                        break;
                    }
                }


            
            
            
            } else if (command.equals("freeSpace")) {
                System.out.println("Calculating free space...");
                int freeSpace = 0;

                for (int carPlace = 0; carPlace < parkingPlaces; carPlace++) {
                    if (cars.get(carPlace) == null) {
                        freeSpace++;
                    }
                }
                System.out.println("There are " + freeSpace + " free places");


                System.out.println("Would you like to see list of parking places? (y or n)");
                String listOfPlaces = inp.nextLine();
                if (listOfPlaces.equals("y")) {
                    for (int place = 0; place < parkingPlaces; place++) {
                        System.out.println(place + " : " + cars.get(place));
                    }
                }


                
            
            
            
            } else if (command.equals("leaveCar")) {
                System.out.println("Remove car... Type car number");
                String carNumber = inp.nextLine();
                for (int carPlace = 0; carPlace < parkingPlaces; carPlace++) {
                    if (carNumber.equals(cars.get(carPlace))) {
                        cars.put(carPlace, null);
                    }
                }
   
   
   
            } else if (command.equals("exit")) {
                System.out.println("Goodbye");
                break;
            }
            }
        }
        inp.close();
    }
}