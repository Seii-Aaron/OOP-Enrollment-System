package org.example.service;

import org.example.model.Department;
import org.example.model.Program;

import java.util.List;

public interface ProgramRegistration {
    void saveProgram(String programID, String programName);
    boolean displayAllPrograms();
    boolean updateProgram(String programID, String programName);
    boolean removeProgram(String programID);
    boolean setProgramDepartment(Department department, Program program);
    boolean displayProgramDepartment(Program program);
    Program getProgram(String programID);
    List<Program> getProgramList();
}
