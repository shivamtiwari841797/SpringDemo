package com.company.springdemo.day03.lab04;

public interface AccountDao {
    void deposit(int accountNumber,int amount);
    void withdraw(int accountNumber,int amount);
}
