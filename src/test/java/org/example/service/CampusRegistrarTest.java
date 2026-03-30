package org.example.service;

import org.example.model.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CampusRegistrarTest {
    @Mock
    private StudentRegistration studReg;

    @Mock
    private CourseRegistration courseReg;

    @InjectMocks
    private CampusRegistrar campusRegistrar;

    @Test
    void shouldSaveANewCourse() {
//        Course course = new Course();
//        String result = campusRegistrar.saveCourse(course);
//        assertEquals("Success", result);
//        verify(courseReg).saveCourse(course);
    }

    @Test
    void shouldDisplayAllCourses() {
//        Course course = new Course();
//        String result = campusRegistrar.displayAllCourses();
//        assertEquals("Success", result);
//        verify(courseReg).displayAllCourses();
    }

    @Test
    void updateCourse() {
//        Course course = new Course("1234");
//        String result = campusRegistrar.updateCourse(course, "InteProg", "IT");
//        assertEquals("Success", result);
//        verify(courseReg).updateCourse(course, "InteProg", "IT");
    }

    @Test
    void removeCourse() {
//        Course course = new Course();
//        String result = campusRegistrar.removeCourse(courseID);
//        assertEquals("Success", result);
//        verify(courseReg).displayAllCourses();
    }

    @Test
    void saveStudent() {
    }

    @Test
    void displayAllStudent() {
    }

    @Test
    void updateStudent() {
    }

    @Test
    void removeStudent() {
    }
}