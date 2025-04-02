package com.itproger;

public class Person1 implements Info{
    public String name;

    public Person1(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}
