package com.bean3.beans;

import com.bean2.beans.Vehicle;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data
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



}
