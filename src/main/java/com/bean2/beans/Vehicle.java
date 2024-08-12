package com.bean2.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Vehicle {

    private String name;

    public void printHello(){
        System.out.println(
            "Printing Hello from Component Vehicle Bean");
    }
}
