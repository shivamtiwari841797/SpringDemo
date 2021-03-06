package com.company.springdemo.lab03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@PropertySource("classpath:lab03.properties")
public class Company {

    private String name;
    private String location;

    @Value("CEO-Name")
    private String ceoName;

    @Value("40")
    private int ceoAge;

    @Autowired
//    @Qualifier("employees")
    private Set<Employee> employees;

    public Company(@Value("${company.name}") String name, @Value("${company.location}") String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public int getCeoAge() {
        return ceoAge;
    }

    public void setCeoAge(int ceoAge) {
        this.ceoAge = ceoAge;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", ceoName='" + ceoName + '\'' +
                ", ceoAge=" + ceoAge +
                ", employees=" + employees +
                '}';
    }
}
