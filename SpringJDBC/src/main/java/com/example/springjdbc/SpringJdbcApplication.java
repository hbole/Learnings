package com.example.springjdbc;

import com.example.springjdbc.models.Student;
import com.example.springjdbc.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

        Student student = context.getBean(Student.class);
        student.setRollNo(105);
        student.setName("Harshit");
        student.setMarks(95);

        StudentService studentService = context.getBean(StudentService.class);
        studentService.addStudent(student);

        List<Student> students = studentService.getStudents();
        System.out.println(students);
    }

}
