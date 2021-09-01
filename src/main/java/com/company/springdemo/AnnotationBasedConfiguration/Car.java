package com.company.springdemo.AnnotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//<bean id = "car" class = "---"/>
@Component
@Scope("prototype")
public class Car {

    //<property name = "model" value = "BMW"/>
    @Value("BMW")
    private String model;

    @Value("2020")
    private int YearOfMake;

    //<property name = "engine" ref = "engine"/>
    @Autowired
    private Engine engine;

    public int getYearOfMake() {
        return YearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        YearOfMake = yearOfMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
