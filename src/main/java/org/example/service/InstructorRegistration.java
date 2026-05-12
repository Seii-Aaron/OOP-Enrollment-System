package org.example.service;

import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Program;

import java.util.List;

public interface InstructorRegistration {
    void saveInstructor(String instructorID, String name);
    boolean displayAllInstructors();
    boolean updateInstructor(String instructorID, String name);
    boolean removeInstructor(String instructorID);
    boolean setInstructorProgram(String instructorID, Program program);
    boolean displayInstructorProgram(String instructorID);
    Instructor getInstructor(String instructorID);
    boolean addCourseToInstructor(Course course, String instructorID);
    boolean removeCourseFromInstructor(Course course, String instructorID);
    boolean displayInstructorCourses(Instructor instructor);
    List<Instructor> getInstructorList();
}
