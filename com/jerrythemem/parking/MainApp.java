package com.jerrythemem.parking;

import java.util.Scanner;

class MainApp {
    
    public static void main(String[] args) {
        
        String[] cars = new String[5];

        Scanner inp = new Scanner (System.in);
        System.out.println("Open parking: (y or n)");
        String open = inp.nextLine();
        
        if (open.equals("n")) {
            System.out.println("See you next time");
        
        
        } else if (open.equals("y")) {
            
            while (true) {
            System.out.println("Continue");
            System.out.println("Choose command: newCar, freeSpace, leaveCar");
            String command = inp.nextLine();
            
            
            
            if (command.equals("newCar")) {
                System.out.println("Adding new car... Type car number:");
                String carNumber = inp.nextLine();
                for (int carPlace = 0; carPlace < cars.length; carPlace++) {
                    System.out.println("check1");
                    if (cars[carPlace] == null) {    
                        System.out.println("check2");                   
                        cars[carPlace] = carNumber;
                        break;
                    }
                }




                System.out.println("Close parking? (y or n)");
                String closing = inp.nextLine();
                if (closing.equals("y")) {
                    break;
                } else if (closing.equals("n")) {
                    continue;
                }
            
            
            
            } else if (command.equals("freeSpace")) {
                System.out.println("Calculating free space...");
                int freeSpace = 0;

                for (int carPlace = 0; carPlace < cars.length; carPlace++) {
                    if (cars[carPlace] == null) {
                        freeSpace++;
                    }
                }
                System.out.println("There are " + freeSpace + " free places");


                

                System.out.println("Close parking? (y or n)");
                String closing = inp.nextLine();
                if (closing.equals("y")) {
                    break;
                } else if (closing.equals("n")) {
                    continue;
                }
            
            
            
            } else if (command.equals("leaveCar")) {
                System.out.println("Remove car... Type car number");
                String carNumber = inp.nextLine();
                for (int carPlace = 0; carPlace < cars.length; carPlace++) {
                    if (carNumber.equals(cars[carPlace])) {
                        cars[carPlace] = null;
                    }
                }



                System.out.println("Close parking? (y or n)");
                String closing = inp.nextLine();
                if (closing.equals("y")) {
                    break;
                } else if (closing.equals("n")) {
                    continue;
                }
            }
            }
        }
        inp.close();
    }
}