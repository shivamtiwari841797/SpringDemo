package com.company.springdemo.day03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:day03/beans.xml");
        PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");
        personDao.insertPerson(1,"Shivam", 24);
        personDao.insertPerson(2,"ShivamT", 24);
//        personDao.deletePerson(1);
        System.out.println(personDao.getAll().size());
        System.out.println("Done!!!");

    }
}
