package org.example.service;

import org.example.model.Program;
import org.example.model.Student;

import java.util.List;

public interface StudentRegistration {
    void saveStudent(String studentID, String name);
    boolean displayAllStudent();
    boolean updateStudent(String studentID, String name);
    boolean removeStudent(String studentID);
    boolean setStudentProgram(String studentID, Program program);
    List<Student> getStudentList();
}
