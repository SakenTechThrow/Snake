//package com.itproger;
//
//public abstract class Vehicle {
//    private String brand;
//    private int year;
//
//    public Vehicle(String brand, int year){
//        this.brand = brand;
//        this.year = year;
//    }
//
//    public void displayInfo(){
//        System.out.println("Brand: " + brand);
//        System.out.println("Year: " + year);
//    }
//    public abstract void move();
//
//}
//interface Drivable{
//    public void drive();
//}
//interface Flyable{
//    public void fly();
//}
//class Car extends Vehicle implements Drivable{
//    public Car(String brand, int year){
//        super(brand, year);
//    }
//
//    @Override
//    public void move() {
//        System.out.println("Car is moving!");
//    }
//
//    @Override
//    public void drive() {
//        System.out.println("Car is driving");
//    }
//}
//class Airplane extends Vehicle implements Flyable{
//    public Airplane(String brand, int year) {
//        super(brand, year);
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("Airplane is flying!");
//    }
//
//    @Override
//    public void move() {
//        System.out.println("Airplane is moving!");
//    }
//}
//    class FlyingCar extends Vehicle implements Drivable, Flyable{
//
//    public FlyingCar(String brand, int year) {
//        super(brand, year);
//    }
//
//    @Override
//    public void move() {
//        System.out.println("FlyingCar is moving!");
//    }
//
//    @Override
//    public void drive() {
//        System.out.println("FlyingCar is driving!");
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("FlyingCar is flying!");
//    }
//}

package com.itproger;

//import java.util.ArrayList;
//
//abstract class Vehicle {
//    private String brand;
//    private int year;
//
//    public Vehicle(String brand, int year){
//        this.brand = brand;
//        this.year = year;
//    }
//
//    public void displayInfo(){
//        System.out.println("Brand: " + brand);
//        System.out.println("Year: " + year);
//    }
//    public abstract void move();
//
//}
//interface Drivable{
//    public void drive();
//}
//interface Flyable{
//    public void fly();
//}
//class Car extends Vehicle implements Drivable{
//    public Car(String brand, int year){
//        super(brand, year);
//    }
//
//    @Override
//    public void move() {
//        System.out.println("Car is moving!");
//    }
//
//    @Override
//    public void drive() {
//        System.out.println("Car is driving");
//    }
//}
//class Airplane extends Vehicle implements Flyable{
//    public Airplane(String brand, int year) {
//        super(brand, year);
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("Airplane is flying!");
//    }
//
//    @Override
//    public void move() {
//        System.out.println("Airplane is moving!");
//    }
//}
//class FlyingCar extends Vehicle implements Drivable, Flyable{
//
//    public FlyingCar(String brand, int year) {
//        super(brand, year);
//    }
//
//    @Override
//    public void move() {
//        System.out.println("FlyingCar is moving!");
//    }
//
//    @Override
//    public void drive() {
//        System.out.println("FlyingCar is driving!");
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("FlyingCar is flying!");
//    }
//}
//public class JustMain{
//    public static void main(String[] args) {
//        ArrayList<Vehicle> vehicles = new ArrayList<>();
//        vehicles.add(new Car("Toyota", 2020));
//        vehicles.add(new Car("Mercedes", 2023));
//        vehicles.add(new Car("Nissan", 2002));
//
//        for (Vehicle v : vehicles) {
//            v.displayInfo();
//
//            v.move();
//
//            if (v instanceof Drivable){
//                ((Drivable) v).drive();
//            }
//            if (v instanceof Flyable){
//                ((Flyable) v ).fly();
//            }
//        }
//    }
//}
