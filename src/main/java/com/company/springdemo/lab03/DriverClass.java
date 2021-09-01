package com.company.springdemo.lab03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:lab03.xml");

        Company company = (Company) applicationContext.getBean("company");
        System.out.println(company);
    }
}
