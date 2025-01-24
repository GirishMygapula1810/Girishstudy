package com.amazon.finance.car;

public class car {
    String color;
    String model;

     public car(String Carcolor, String Carmodel){
         color = Carcolor;
         model = Carmodel;
     }

     void drive(){
         System.out.println("My Car " + color + " and " + model + " is ready ");
     }
     void drivingwheels(){
         System.out.println("Driving" + color);
     }

         public static void main(String[] args){
             car car1 = new car("red" , "SUV");
             car car2 = new car("black" , "XUV");
             car1.drive();
             car2.drive();
             car1.drivingwheels();
         }

}
