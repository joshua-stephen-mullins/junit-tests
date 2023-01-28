import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class CohortTest {

    Cohort students;
    Student joshua;

    @Before
    public void setUp(){
        students = new Cohort();
        joshua = new Student(12345, "joshua");
        students.addStudent(joshua);
        joshua.addGrade(100);
        joshua.addGrade(90);
    }

    @Test
    public void testAddStudent(){
        System.out.println(students.getStudents());
        assertTrue(students.getStudents().contains(joshua));
//        assertTrue();
    }

    @Test
    public void testGetStudents(){
        assertEquals(1, students.getStudents().size());
    }

    @Test
    public void testCohortAverage(){
        assertEquals(95, students.getCohortAverage(), 0.0);
    }

}
