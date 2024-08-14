package com.bean1;



import com.bean1.bean.Car;
import com.bean1.config.ProjectConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {

    public static void main(String[] args) {
        //SpringApplication.run(SpringDemoApplication.class, args);
        var bn1= new AnnotationConfigApplicationContext(ProjectConfig.class);
        var machine=bn1.getBean( "Acar", Car.class);
        System.out.println(machine.getName());

        var bn2=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var strings=bn2.getBean("hello", String.class);
        System.out.println(strings);

        var bn3=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var num=bn3.getBean("number", Integer.class);
        System.out.println(num);

        var bn4=new AnnotationConfigApplicationContext(ProjectConfig.class);
        //var machine2=bn4.getBean(Car.class);
        /* -> error
         because in that main class have diff method,
         we should specify which method in that class we're going to use
         or getting a default bean which include @Primary annotation*/
        var machine2=bn4.getBean("Bcar",Car.class);
        System.out.println(machine2.getName());

        var bn5=new AnnotationConfigApplicationContext(ProjectConfig.class);
        //var machine3=bn5.getBean( Car.class);
        /* -> error
         because in that main class have diff method,
         we should specify which method in that class we're going to use
         or getting a default bean which include @Primary annotation*/
        var machine3=bn5.getBean( Car.class); //default bean , no name
        System.out.println(machine3.getName());


        var bn6=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var machine4=bn6.getBean( Car.class);
        System.out.println(machine4.getName());
    }

}
