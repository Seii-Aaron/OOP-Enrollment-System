package org.example.service;

import org.example.model.Student;

import java.util.List;

public interface StudentRegistration {
    void saveStudent(String studentID, String name, String program);
    void displayAllStudent();
    boolean updateStudent(String studentID, String name, String program);
    boolean removeStudent(String studentID);
    List<Student> getStudentList();
}
