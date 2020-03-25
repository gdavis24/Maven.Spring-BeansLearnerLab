package com.example.demo.configurations;

import com.example.demo.models.Instructor;
import com.example.demo.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorConfig {
    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(1L, "Kris"));
        instructorList.add(new Instructor(2L, "Nobles"));
        instructorList.add(new Instructor(3L, "Roberto"));

        return new Instructors(instructorList);
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(1L, "Jeff"));
        instructorList.add(new Instructor(2L, "Bob"));
        instructorList.add(new Instructor(3L, "Stacy"));

        return new Instructors(instructorList);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors(){
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(1L, "Dolio"));
        instructorList.add(new Instructor(2L, "Froilan"));
        instructorList.add(new Instructor(3L, "Dan"));

        return new Instructors(instructorList);
    }
}
