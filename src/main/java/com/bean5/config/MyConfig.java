package com.bean5.config;


import com.bean5.beans.Car;
import com.bean5.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.bean5.beans")
public class MyConfig {

    @Bean
    @Primary
    Car carA(){
        var car = new Car();
        car.setBrand("bmw");
        car.setColor("blue");
        return car;
    }

    @Bean
    Car carB(){
        var car = new Car();
        car.setBrand("Audi");
        car.setColor("black");
        return car;
    }

}
