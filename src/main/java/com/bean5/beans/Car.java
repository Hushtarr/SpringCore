package com.bean5.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component(value = "theCar")
public class Car {
    private String brand;
    private String color;


}
