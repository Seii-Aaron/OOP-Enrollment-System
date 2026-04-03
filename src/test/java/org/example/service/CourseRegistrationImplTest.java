package org.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseRegistrationImplTest {
    private CourseRegistrationImpl courseReg;
    @BeforeEach
    void setup(){
        courseReg = new CourseRegistrationImpl();
    }

    @Test
    void shouldSaveANewCourse() {
        courseReg.saveCourse("123", "Math", "IT");
        assertEquals(1, courseReg.getCourseList().size());
    }

    @Test
    void shouldDisplayAllCourses() {
        boolean result = courseReg.displayAllCourses();
        assertTrue(result);
    }

    @Test
    void shouldPassUpdatingACourse() {
        courseReg.saveCourse("123", "Math", "IT");
        boolean updated = courseReg.updateCourse("123", "Science", "CS");
        assertTrue(updated);
        assertEquals("CS", courseReg.getCourseList().get(0).getProgram());
    }

    @Test
    void shouldFailUpdatingACourse() {
        courseReg.saveCourse("123", "Math", "IT");
        boolean updated = courseReg.updateCourse("12345", "Science", "CS");
        assertFalse(updated);
    }

    @Test
    void shouldPassRemovingACourse() {
        courseReg.saveCourse("123", "Math", "IT");
        boolean removed = courseReg.removeCourse("123");
        assertTrue(removed);
        assertEquals(0, courseReg.getCourseList().size());
    }

    @Test
    void shouldFailRemovingACourse() {
        courseReg.saveCourse("123", "Math", "IT");
        boolean removed = courseReg.removeCourse("12345");
        assertFalse(removed);
        assertEquals(1, courseReg.getCourseList().size());
    }

    @Test
    void shouldGetCourseList() {
        courseReg.saveCourse("123", "Math", "IT");
        assertEquals(1, courseReg.getCourseList().size());
    }
}