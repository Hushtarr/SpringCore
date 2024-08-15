package com.bean5.main;

import com.bean5.beans.Car;
import com.bean5.beans.Person;
import com.bean5.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo5 {
    public static void main(String[] args) {
        var context= new  AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.toString());


        Car car = context.getBean(Car.class);
        System.out.println(car.toString());

        Car car2 = context.getBean("theCar", Car.class);
        System.out.println(car2.toString());


    }
}
