package com.example.springjdbc.repositories;

import com.example.springjdbc.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {
        String query = "insert into students (rollno, name, marks) values (?,?,?)";
        int rows = jdbcTemplate.update(query, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println(rows + " affected...");
    }

    public List<Student> findAll() {
        String query = "select * from students";

        return jdbcTemplate.query(query, (rs, rowNum) -> {
            Student student = new Student();
            student.setRollNo(rs.getInt("rollno"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));

            return student;
        });
    }
}
