package com.example.demo.TestConfigurations;

import com.example.demo.models.Students;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Test
    public void testCurrentStudents() {
        Assert.assertTrue(currentStudents.findById(1L).getName().equals("Greg"));
    }

    @Test
    public void testPreviousStudents() {
        Assert.assertTrue(previousStudents.findById(1L).getName().equals("Greg"));
    }

}
