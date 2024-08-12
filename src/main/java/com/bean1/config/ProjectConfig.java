package com.bean1.config;

import com.bean1.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration  //Scan all the content of this class
/*
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
*/
public class ProjectConfig {
    @Bean(name="Acar")
    Car car (){
        var car = new Car();
        car.setName("Audi");
        return car;
    }

    @Bean(value="Bcar")
    Car car2 (){
        var car = new Car();
        car.setName("Benz");
        return car;
    }

    @Primary
    //The Primary bean is the one which Spring will choose if it has multiple options and didn't specify a name.
    @Bean
    Car car3 (){
        var car = new Car();
        car.setName("Bmw");
        return car;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 17;
    }

    /*------------------------------------------------------------------------------------------------*/




}
