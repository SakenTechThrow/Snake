//package com.itproger;
//
// Assignment 2 READY









//public class Task2 {
//    public static void main(String[] args) {
//        Employee manager = new Manager(5000, 2000);
//        System.out.println("Manager salary: " + manager.calculateSalary());
//
//        Employee programmer = new Programmer(50, 160);
//        System.out.println("Programmer salary : " + programmer.calculateSalary());
//    }
//}
//
//class Employee {
//    public double calculateSalary(){
//        return 0.0;
//    }
//}
//class Programmer extends Employee{
//    private double hourlyRate;
//    private int hoursWorked;
//
//    public Programmer(double hourlyRate, int hoursWorked) {
//        this.hourlyRate = hourlyRate;
//        this.hoursWorked = hoursWorked;
//    }
//
//
//    public double calculateSalary() {
//        return hourlyRate * hoursWorked;
//    }
//}
//
//class Manager extends Employee{
//    private double baseSalary;
//    private double bonus;
//
//    public Manager(double baseSalary, double bonus) {
//        this.baseSalary = baseSalary;
//        this.bonus = bonus;
//    }
//
//    @Override
//    public double calculateSalary() {
//        return baseSalary + bonus;
//    }
//}
//
//
//
