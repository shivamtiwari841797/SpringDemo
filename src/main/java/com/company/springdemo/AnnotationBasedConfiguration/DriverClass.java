package com.company.springdemo.AnnotationBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnotationBasedConfig.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car.getModel());
        System.out.println(car.getEngine().getEngineName());
        car.setModel("Benz");
        Car car2 = (Car) applicationContext.getBean("car");
        System.out.println(car2.getModel());
        System.out.println(car2.getEngine().getEngineName());
    }
}
