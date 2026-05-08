package org.example.service;

import org.example.model.Program;
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
        studReg.saveStudent("123", "Aaron");
        assertEquals(1, studReg.getStudentList().size());
    }

    @Test
    void displayAllStudent() {
        boolean result = studReg.displayAllStudent();
        assertTrue(result);
    }

    @Test
    void shouldPassUpdatingAStudent() {
        studReg.saveStudent("123", "Aaaron");
        boolean updated = studReg.updateStudent("123", "Aaron");
        assertTrue(updated);
        assertEquals("Aaron", studReg.getStudentList().get(0).getName());
    }

    @Test
    void shouldFailUpdatingAStudent() {
        studReg.saveStudent("123", "Aaron");
        boolean updated = studReg.updateStudent("12345", "Aaron");
        assertFalse(updated);
    }

    @Test
    void shouldPassRemovingAStudent() {
        studReg.saveStudent("123", "Aaron");
        boolean removed = studReg.removeStudent("123");
        assertTrue(removed);
        assertEquals(0, studReg.getStudentList().size());
    }

    @Test
    void shouldFailRemovingAStudent() {
        studReg.saveStudent("123", "Aaron");
        boolean removed = studReg.removeStudent("12345");
        assertFalse(removed);
        assertEquals(1, studReg.getStudentList().size());
    }

    @Test
    void shouldPassSettingAProgramForAStudent() {
        studReg.saveStudent("123", "Aaron");
        Program BSIT = new Program("1", "BSIT");
        boolean set = studReg.setStudentProgram("123", BSIT);
        assertTrue(set);
        assertEquals("BSIT", studReg.getStudentList().get(0).getProgramName());
    }

    @Test
    void shouldFailSettingAProgramForAStudent() {
        studReg.saveStudent("123", "Aaron");
        Program BSIT = new Program("1", "BSIT");
        boolean set = studReg.setStudentProgram("12345", BSIT);
        assertFalse(set);
        assertEquals("NULL", studReg.getStudentList().get(0).getProgramName());
    }

    @Test
    void getStudentList() {
        studReg.saveStudent("123", "Aaron");
        assertEquals(1, studReg.getStudentList().size());
    }
}