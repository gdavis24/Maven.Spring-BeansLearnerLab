package com.example.demo.configurations;

import com.example.demo.models.Student;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1L, "Greg"));
        studentList.add(new Student(2L, "Emma"));
        studentList.add(new Student(3L, "James"));

        return new Students(studentList);
    }

    @Bean(name = "previous students")
    public Students previousStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(4L, "Reese"));
        studentList.add(new Student(5L, "Dan"));
        studentList.add(new Student(6L, "Maggie"));

        return new Students(studentList);
    }
}
