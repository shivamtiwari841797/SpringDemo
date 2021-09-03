package com.company.springdemo.day03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class PersonDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String > getAllNames() {
        return jdbcTemplate.queryForList("select name from person", String.class);
    }

    public List<Person> getAll() {
        return jdbcTemplate.query("select * from person", new PersonRowMapper());
    }

    public List<String> getAllInCSV() {
        return jdbcTemplate.query("select * from person", new PersonRowMapperInCSV());
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

class PersonRowMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setAge(resultSet.getInt("age"));
        person.setName(resultSet.getString("name"));
        person.setId(resultSet.getInt("id"));
        return person;
    }
}

class PersonRowMapperInCSV implements RowMapper<String> {

    @Override
    public String mapRow(ResultSet resultSet, int i) throws SQLException {
        StringBuilder sb = new StringBuilder();
        sb.append(resultSet.getInt("id"));
        sb.append(",");
        sb.append(resultSet.getString("name"));
        sb.append(",");
        sb.append(resultSet.getInt("age"));
        return sb.toString();
    }
}