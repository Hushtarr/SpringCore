package com.part3.beans;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class Car {

    public Car(){
        System.out.println("Car bean created by Spring");
    }
    private String name = "Toyota";

}
