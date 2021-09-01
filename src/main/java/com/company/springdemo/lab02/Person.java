package com.company.springdemo.lab02;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("Init Called!");
    }

    public void destroy() {
        System.out.println("Destroy Called!");
    }
}
