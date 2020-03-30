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
public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    Students currentStudents;

    @Autowired
    @Qualifier("tcUkInstructors")
    Students previousStudents;

    @Test
    public void testCurrentStudents() {
        Assert.assertTrue(currentStudents.findById(1L).getName().equals("Kris"));
    }

    @Test
    public void testPreviousStudents() {
        Assert.assertTrue(previousStudents.findById(1L).getName().equals("Jeff"));
    }

}
