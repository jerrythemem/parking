package com.jerrythemem.parking;

class MainApp {
<<<<<<< HEAD
=======
    
    public static void main(String[] args) {
        
        int parkingPlaces = 10;
        var cars = new HashMap<Integer, String>();
        
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
>>>>>>> f902152... Minor rebuild map init

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}