package com.part3.main;


import com.part3.beans.Car;
import com.part3.beans.Person;
import com.part3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo3 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Car car = context.getBean(Car.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Car name from Spring Context is: " + car.getName());
        System.out.println("Car that Person own is: " + person.getCar());

    }
}
