package com.part4.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
//  @Lazy -> bean will be created when it needs rather than created while the app starts
public class Person {

    private String name="Lucy";
    private final Vehicle vehicle;

//    @Autowired
//    public Person(Vehicle vehicle3){ //Parameters can be mapped to bean names
//        System.out.println("Person bean created by Spring");
//        this.vehicle = vehicle3;
//    }

    @Autowired
    public Person(@Qualifier("MyCar") Vehicle vehicle){ //Parameters can be mapped to bean names
        System.out.println("Person bean created by Spring");
        this.vehicle = vehicle;
    }

}
