package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifiedCarApp {

    public static void main(String[] args) {


        String userInput = "";
        Scanner keyboard = new Scanner(System.in);

        //create Arraylist and calling Arraylist cars
        //"ModifiedCarr" is the object that the Arraylist is composed of
        //cars is the title of whatever the ArrayList is
        ArrayList<ModifiedCarr> cars = new ArrayList<>();


        //while loop and running until user input equals 'no'
        while (!userInput.equalsIgnoreCase("no")){

//telling system what to print
            System.out.println("do you want to add a car?");
//            resetting the value of user input
//            setting the user value to whatever the user types in
            userInput = keyboard.next();

            //if user input is 'yes' then run all below code
            if (userInput.equalsIgnoreCase("yes")){

                //declaring the object of the arraylist
                ModifiedCarr modified = new ModifiedCarr();
//telling the user what to enter in the system
                System.out.println("please type characteristics of the car");
                System.out.println("car color");

//lines 20 - 26 set values to the variables
                modified.setColor(keyboard.next());

                System.out.println("car make");
                modified.setMake(keyboard.next());

                System.out.println("car windows");
                modified.setWindows(keyboard.next());
                //adding modified object with defined variables to array list 'cars'
                cars.add(modified);
            }
//            else{
//               break;
//           }
        }
        //telling Arraylist what the object is / and creating object


//prompt user to type characteristics of the car
        //enhanced loop
    for(ModifiedCarr modifiedCarr: cars){

        //want this app to print this method
        System.out.println(modifiedCarr.getDescription());
    }

    }

}
