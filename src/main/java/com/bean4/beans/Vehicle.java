package com.bean4.beans;

import lombok.Data;

@Data
public class Vehicle {

    private String name;
    public void printHello(){
        System.out.println(
            "Printing Hello from Component Vehicle Bean");
    }
    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}
