///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Task3;
//
///**
// *
// * @author mamma
// */
//public class Car {
//    
//    public static void main(String[] args) {
//        Car car = new Car("BWM", "full", 2011);
//        
//        System.out.println("Car model: " + car.model + " " + "Car fuel: " + car.fuelType + " " + "Car year: " + car.yearOfProduction);
//        car.carSpeed(40);
//        car.checkSpeed(50);
//        
//        car.carSlow(10);
//        car.checkSpeed(50);
//        
//        car.stop(30);
//        
//    }
//
//    String brand;
//    String model;
//    String fuelType;
//    int yearOfProduction;
//    double speed = 0;
//
//    public Car(String model, String fuelType, int yearOfType) {
//        this.model = model;
//        this.fuelType = fuelType;
//        this.yearOfProduction = yearOfType;
//
//    }
//    
//    public void carSpeed(double speedUp){
//        this.speed+=speedUp;
//    }
//    public void carSlow(double speedSlow){
//        if(this.speed>=speedSlow){
//            this.speed-=speedSlow;
//        }else{
//            this.speed=0;
//        }
//    }
//    public void stop(double speed){
//        this.speed=0;
//        System.out.println("Car is stop" + this.speed);
//    }
//    
//    public void checkSpeed(double limit){
//        if(this.speed>limit){
//            System.err.println("You exceeded the speed limit: " + this.speed);
//        }
//        else{
//            System.out.println("Speed is normal. Speed: " +this.speed);
//        }
//    }
//}
