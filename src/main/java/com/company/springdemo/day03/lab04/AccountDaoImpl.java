package com.company.springdemo.day03.lab04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AccountDaoImpl implements  AccountDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private int getBalance(int accountNumber) {
        String sql = "select balance from accounts where account_number = " + accountNumber ;
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public void deposit(int accountNumber, int amount) {
        String sql = "update accounts set balance = balance + ? where account_number = ?";
        jdbcTemplate.update(sql, amount, accountNumber);
        System.out.println("Deposit Successful!!!");
    }

    @Override
    public void withdraw(int accountNumber, int amount) {
        String sql = "update accounts set balance = balance - ? where account_number = ? and balance = ?";
        int rowsAffected = jdbcTemplate.update(sql, amount, accountNumber, amount);
        if(rowsAffected > 0) {
            System.out.println("Withdrawal Successful!!!");
        }
        else {
            System.out.println("Withdrawal can not be completed due to insufficient balance!!!");
        }
    }
}
