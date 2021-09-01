package com.company.springdemo.lab02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.getName());
    }
}
