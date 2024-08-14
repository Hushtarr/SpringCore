package com.bean3.beans;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public Car(){
        System.out.println("Car bean created by Spring");
    }
    private String name = "Toyota";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println(
            "Printing Hello from Component Car Bean");
    }

    @Override
    public String toString(){
        return "Car name is - "+name;
    }
}
