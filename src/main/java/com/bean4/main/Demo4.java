package com.bean4.main;


import com.bean4.beans.Person;
import com.bean4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo4 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("before creating bean");
        Person person = context.getBean(Person.class);
        System.out.println("after creating bean");


        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }
}
