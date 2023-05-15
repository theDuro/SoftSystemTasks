package pl.siftsystem.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.siftsystem.project.task4.Group;
import pl.siftsystem.project.task4.School;
import pl.siftsystem.project.task4.Student;
import pl.siftsystem.project.task4.Teacher;

import java.util.ArrayList;

public class SchoolTest {
    private School school;
    private Teacher tomJohnson;
    private Teacher elizabethHall;
    private Group englishGroup;
    private Group frenchGroup;
    private Group informaticsGroup;
    private Student davidRussell;
    private Student nicholasGrant;
    private Student emmaFletcher;

    @BeforeEach
    public void setup() {
        // Create a school
        school = new School("Freedom");

        // Create teachers
        tomJohnson = new Teacher("Tom", "Johnson",new ArrayList<>());
        elizabethHall = new Teacher("Elizabeth", "Hall",new ArrayList<>());

        // Add teachers to the school
        school.addTeacher(tomJohnson);
        school.addTeacher(elizabethHall);

        // Create groups
        englishGroup = new Group("English", elizabethHall);
        frenchGroup = new Group("French", elizabethHall);
        informaticsGroup = new Group("Informatics", tomJohnson);

        // Create students
        davidRussell = new Student("David", "Russell");
        nicholasGrant = new Student("Nicholas", "Grant");
        emmaFletcher = new Student("Emma", "Fletcher");
    }

    @Test
    public void testAddStudentToGroup() {
        englishGroup.addStudent(davidRussell);
        englishGroup.addStudent(nicholasGrant);

        Assertions.assertTrue(englishGroup.getStudents().contains(davidRussell));
        Assertions.assertTrue(englishGroup.getStudents().contains(nicholasGrant));
    }

    @Test
    public void testRemoveStudentFromGroup() {
        englishGroup.addStudent(emmaFletcher);
        englishGroup.removeStudent(emmaFletcher);

        Assertions.assertFalse(englishGroup.getStudents().contains(emmaFletcher));
    }

    @Test
    public void testAddTeacherToGroup() {
        informaticsGroup.setTeacher(tomJohnson);

        Assertions.assertEquals(tomJohnson, informaticsGroup.getTeacher());
        Assertions.assertTrue(tomJohnson.getTeachingGroups().contains(informaticsGroup));
    }

    @Test
    public void testRemoveTeacherFromGroup() {
        englishGroup.setTeacher(elizabethHall);
        englishGroup.setTeacher(null);

        Assertions.assertNull(englishGroup.getTeacher());
        Assertions.assertFalse(elizabethHall.getTeachingGroups().contains(englishGroup));
    }



}