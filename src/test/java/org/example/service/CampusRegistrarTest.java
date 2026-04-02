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
        String result = campusRegistrar.saveCourse("123", "Prog", "BSIT");
        assertEquals("Success", result);
        verify(courseReg).saveCourse("123", "Prog", "BSIT");
    }

    @Test
    void shouldDisplayAllCourses() {
        String result = campusRegistrar.displayAllCourses();
        assertEquals("Success", result);
        verify(courseReg).displayAllCourses();
    }

    @Test
    void shouldUpdateACourse() {
        when(courseReg.updateCourse("123", "InteProg", "IT")).thenReturn(true);
        String positive = campusRegistrar.updateCourse("123", "InteProg", "IT");
        assertEquals("Success", positive);
        verify(courseReg).updateCourse("123", "InteProg", "IT");

        String negative = campusRegistrar.updateCourse("124", "InteProg", "IT");
        assertEquals("Failed to update course. Please double check the course ID.", negative);
        verify(courseReg).updateCourse("124", "InteProg", "IT");
    }

    @Test
    void shouldRemoveACourse() {
        when(courseReg.removeCourse("123")).thenReturn(true);
        String positive = campusRegistrar.removeCourse("123");
        assertEquals("Success", positive);
        verify(courseReg).removeCourse("123");

        String negative = campusRegistrar.removeCourse("124");
        assertEquals("Failed to remove course. Please double check the course ID.", negative);
        verify(courseReg).removeCourse("124");
    }

    @Test
    void shouldSaveANewStudent() {
        String result = campusRegistrar.saveStudent("123", "Joseph", "BSIT");
        assertEquals("Success", result);
        verify(studReg).saveStudent("123", "Joseph", "BSIT");
    }

    @Test
    void shouldDisplayAllStudents() {
        String result = campusRegistrar.displayAllStudent();
        assertEquals("Success", result);
        verify(studReg).displayAllStudent();
    }

    @Test
    void shouldUpdateAStudent() {
        when(studReg.updateStudent("123", "John", "BSCS")).thenReturn(true);
        String positive = campusRegistrar.updateStudent("123", "John", "BSCS");
        assertEquals("Success", positive);
        verify(studReg).updateStudent("123", "John", "BSCS");

        String negative = campusRegistrar.updateStudent("124", "John", "BSCS");
        assertEquals("Failed to update student. Please double check the student ID.", negative);
        verify(studReg).updateStudent("124", "John", "BSCS");
    }

    @Test
    void shouldRemoveAStudent() {
        when(studReg.removeStudent("123")).thenReturn(true);
        String positive = campusRegistrar.removeStudent("123");
        assertEquals("Success", positive);
        verify(studReg).removeStudent("123");

        String negative = campusRegistrar.removeStudent("124");
        assertEquals("Failed to remove student. Please double check the student ID.", negative);
        verify(studReg).removeStudent("124");
    }
}