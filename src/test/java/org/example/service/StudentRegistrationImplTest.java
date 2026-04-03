package org.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentRegistrationImplTest {
    private StudentRegistrationImpl studReg;
    @BeforeEach
    void setup(){
        studReg = new StudentRegistrationImpl();
    }

    @Test
    void shouldSaveANewStudent() {
        studReg.saveStudent("123", "Aaron", "BSIT");
        assertEquals(1, studReg.getStudentList().size());
    }

    @Test
    void displayAllStudent() {
        boolean result = studReg.displayAllStudent();
        assertTrue(result);
    }

    @Test
    void shouldPassUpdatingAStudent() {
        studReg.saveStudent("123", "Aaaron", "BSCS");
        boolean updated = studReg.updateStudent("123", "Aaron", "BSIT");
        assertTrue(updated);
        assertEquals("BSIT", studReg.getStudentList().get(0).getProgram());
    }

    @Test
    void shouldFailUpdatingAStudent() {
        studReg.saveStudent("123", "Aaron", "BSIT");
        boolean updated = studReg.updateStudent("12345", "Aaron", "BSCS");
        assertFalse(updated);
    }

    @Test
    void shouldPassRemovingAStudent() {
        studReg.saveStudent("123", "Aaron", "BSIT");
        boolean removed = studReg.removeStudent("123");
        assertTrue(removed);
        assertEquals(0, studReg.getStudentList().size());
    }

    @Test
    void shouldFailRemovingAStudent() {
        studReg.saveStudent("123", "Aaron", "BSIT");
        boolean removed = studReg.removeStudent("12345");
        assertFalse(removed);
        assertEquals(1, studReg.getStudentList().size());
    }

    @Test
    void getStudentList() {
        studReg.saveStudent("123", "Aaron", "BSIT");
        assertEquals(1, studReg.getStudentList().size());
    }
}