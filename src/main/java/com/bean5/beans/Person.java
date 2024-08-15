package com.bean5.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person {
    private String name;
    private int age;
    private Car car;
    @Autowired
    public Person(@Qualifier("carA") Car car) {
        this.car = car;
    }
}
