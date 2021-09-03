package com.company.springdemo.day03.lab04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountUser {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("day03/lab04/beans.xml");
        AccountService accountService =
                (AccountService) applicationContext.getBean("accountService");
        accountService.deposit(101, 1000);
        accountService.withdraw(101, 40000);
        accountService.withdraw(102, 5000);
        System.out.println("Transactions Completed!!!");
    }
}
