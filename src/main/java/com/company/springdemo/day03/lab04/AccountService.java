package com.company.springdemo.day03.lab04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void deposit(int accountNumber, int amount) {
        accountDao.deposit(accountNumber, amount);
    }
    public void withdraw(int accountNumber, int amount) {
        accountDao.withdraw(accountNumber, amount);
    }
}
