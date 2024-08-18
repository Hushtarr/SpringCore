package com.part6.main;

import com.part6.beans.Car;
import com.part6.beans.Person;
import com.part6.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo6 {
    public static void main(String[] args) {
        var context= new  AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println("-------------------this is @Scope(BeanDefinition.SCOPE_PROTOTYPE)-----------------------------");
        //PROTOTYPE -> each time a new bean
        Car car1 = context.getBean(Car.class);
        Car car2 = context.getBean(Car.class);
        System.out.println("Same bean ? :"+(car1==car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        // false because -> SCOPE_PROTOTYPE


        System.out.println("-------------------this is @Scope(BeanDefinition.SCOPE_SINGLETON)-----------------------------");
        //SINGLETON → only one bean all the time → default in Spring
        Person person1 = context.getBean(Person.class);
        Person person2 = context.getBean(Person.class);
        System.out.println("same bean ? :"+(person1==person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        // true because -> SCOPE_SINGLETON
    }
}
