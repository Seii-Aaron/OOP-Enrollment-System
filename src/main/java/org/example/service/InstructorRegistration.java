package org.example.service;

import org.example.model.Instructor;

import java.util.List;

public interface InstructorRegistration {
    void saveInstructor(String courseID, String name, String program);
    boolean displayAllInstructors();
    boolean updateInstructor(String courseID, String name, String program);
    boolean removeInstructor(String courseID);
    List<Instructor> getInstructorList();
}
