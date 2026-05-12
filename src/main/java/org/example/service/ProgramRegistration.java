package org.example.service;

import org.example.model.Course;
import org.example.model.Department;
import org.example.model.Program;
import org.example.model.Section;

import java.util.List;

public interface ProgramRegistration {
    void saveProgram(String programID, String programName);
    boolean displayAllPrograms();
    boolean updateProgram(String programID, String programName);
    boolean removeProgram(String programID);
    boolean setProgramDepartment(Department department, Program program);
    boolean displayProgramDepartment(Program program);
    boolean addCourseToProgram(Program program, Course course);
    boolean removeCourseFromProgram(Program program, Course course);
    boolean addSectionToProgram(Program program, Section section);
    boolean removeSectionFromProgram(Program program, Section section);
    Program getProgram(String programID);
    List<Program> getProgramList();
}
