package org.example.service;

import org.example.model.Course;
import org.example.model.Instructor;

import java.util.List;

public interface InstructorRegistration {
    void saveInstructor(String instructorID, String name, String program);
    boolean displayAllInstructors();
    boolean updateInstructor(String instructorID, String name, String program);
    boolean removeInstructor(String instructorID);
    boolean addCourseToInstructor(Course course, String instructorID);
    boolean removeCourseToInstructor(Course course, String instructorID);
    void displayInstructorCourses(Instructor instructor);
    List<Instructor> getInstructorList();
}
