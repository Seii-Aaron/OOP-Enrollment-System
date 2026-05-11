package org.example.service;

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

    @InjectMocks
    private CampusRegistrar campusRegistrar;

    //Testing for Course Registration


    //Testing for Student Registration
    @Test
    void shouldSaveANewStudent() {
        String result = campusRegistrar.saveStudent("123", "Joseph");
        assertEquals("Success", result);
        verify(studReg).saveStudent("123", "Joseph");
    }

    @Test
    void shouldDisplayAllStudents() {
        String result = campusRegistrar.displayAllStudent();
        assertEquals("Success", result);
        verify(studReg).displayAllStudent();
    }

    @Test
    void shouldPassUpdatingAStudent() {
        when(studReg.updateStudent("123", "John")).thenReturn(true);
        String positive = campusRegistrar.updateStudent("123", "John");
        assertEquals("Success", positive);
        verify(studReg).updateStudent("123", "John");
    }

    @Test
    void shouldFailUpdatingAStudent() {
        String negative = campusRegistrar.updateStudent("124", "John");
        assertEquals("Failed to update student. Please double-check the student ID.", negative);
        verify(studReg).updateStudent("124", "John");
    }

    @Test
    void shouldPassRemovingAStudent() {
        when(studReg.removeStudent("123")).thenReturn(true);
        String positive = campusRegistrar.removeStudent("123");
        assertEquals("Success", positive);
        verify(studReg).removeStudent("123");
    }

    @Test
    void shouldFailRemovingAStudent() {
        String negative = campusRegistrar.removeStudent("124");
        assertEquals("Failed to remove student. Please double-check the student ID.", negative);
        verify(studReg).removeStudent("124");
    }
}