package com.company.springdemo.day03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String > getAll() {
        return jdbcTemplate.queryForList("select name from person", String.class);
    }

    public void insertPerson(int id, String name, int age) {
        String query = "insert into person values(?, ?, ?)";
        jdbcTemplate.update(query, id, name, age);
    }

    public void deletePerson(int id) {
        String query = "delete from person where id = ?";
        jdbcTemplate.update(query, id);
    }

}
