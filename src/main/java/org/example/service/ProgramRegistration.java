package org.example.service;

import org.example.model.Program;

import java.util.List;

public interface ProgramRegistration {
    void saveProgram(String programID, String programName);
    boolean displayAllPrograms();
    boolean updateProgram(String programID, String programName);
    boolean removeProgram(String programID);
    List<Program> getProgramList();
}
