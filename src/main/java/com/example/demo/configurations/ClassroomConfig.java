package com.example.demo.configurations;

import com.example.demo.models.Classroom;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("students") Students students) {
        return new Classroom(instructors, students);
    }

    @Bean
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("previousStudents") Students students){
        return new Classroom(instructors, students);
    }
}
