package org.example.service;

import org.example.model.Program;
import org.example.model.Section;
import org.example.model.Student;

import java.util.List;

public interface StudentRegistration {
    void saveStudent(String studentID, String name);
    boolean displayAllStudent();
    boolean updateStudent(String studentID, String name);
    boolean removeStudent(String studentID);
    boolean setStudentProgram(String studentID, Program program);
    boolean setStudentSection(String studentID, Section section);
    Student getStudent(String studentID);
    List<Student> getStudentList();
}
