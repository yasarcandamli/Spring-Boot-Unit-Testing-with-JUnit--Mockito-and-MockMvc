package com.luv2code.springmvc;

import com.luv2code.springmvc.models.CollegeStudent;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource("/application.properties")
@SpringBootTest
public class StudentAndGradeServiceTest {

    @Test
    public void createStudentService() {

        studentService.createStudent("Chad", "Darby", "chad.darby@luv2code_school.com");

        // CollegeStudent student = studentDao.findByEmailAdress("chad.darby@luv2code_school.com");

        // assertEquals("chad.darby@luv2code_school.com", student.getEmailAddress(), "find by email");
    }
}
