package com.company.springdemo.day03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class JdbcMain {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:day03/beans.xml");
        PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");
        personDao.insertPerson(1,"Shivam", 24);
        personDao.insertPerson(2,"ShivamT", 24);
//        personDao.deletePerson(1);
        writeToCsvFile(personDao.getAllInCSV());
        System.out.println(personDao.getAllNames().size());
        System.out.println(personDao.getAll());
    }

    private static void writeToCsvFile(List<String> csvdata) throws IOException {
        FileWriter file = new FileWriter(String.valueOf(Paths.get("src/main/resources/day03/csvdata.csv")));
        for(String line: csvdata) {
            file.write(line);
            file.write("\n");
        }
        file.close();
    }
}
