package com.bean3.beans;

import com.bean2.beans.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name="Lucy";

    @Autowired
    public Person(Car car){
        System.out.println("Person bean created by Spring");
        this.car=car;
    }

    /*
    The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */
    /*@Autowired*/
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    /*@Autowired*/
    public void setCar(Car vehicle) {
        this.car = car;
    }

}
