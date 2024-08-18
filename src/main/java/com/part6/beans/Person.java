package com.part6.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Person {
    private String name;
    private int age;
}
