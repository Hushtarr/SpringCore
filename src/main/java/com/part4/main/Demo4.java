package com.part4.main;


import com.part4.beans.Person;
import com.part4.beans.Vehicle;
import com.part4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo4 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("before creating bean");
        Person person = context.getBean(Person.class);
        System.out.println("after creating bean");

        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle().getName());

        Vehicle vehicle = context.getBean("MyCar",Vehicle.class);
        System.out.println("Vehicle : " + vehicle.getName());
        vehicle.printHello();

    }
}
