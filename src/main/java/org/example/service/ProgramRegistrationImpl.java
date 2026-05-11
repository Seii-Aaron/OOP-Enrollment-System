package org.example.service;

import org.example.model.Course;
import org.example.model.Department;
import org.example.model.Program;

import java.util.ArrayList;
import java.util.List;

public class ProgramRegistrationImpl implements ProgramRegistration{
    private List<Program> programList = new ArrayList<>();

    public void saveProgram(String programID, String programName){
        programList.add(new Program(programID, programName));
    }

    public boolean displayAllPrograms(){
        System.out.println(programList);
        return true;
    }

    public boolean updateProgram(String programID, String programName){
        for(int i = 0; i<programList.size(); i++){
            if(programList.get(i).getProgramID().equals(programID)){
                programList.set(i, new Program(programID, programName));
                return true;
            }
        }
        return false;
    }

    public boolean removeProgram(String programID){
        for(int i = 0; i<programList.size(); i++){
            if(programList.get(i).getProgramID().equals(programID)){
                programList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean setProgramDepartment(Department department, Program program){
        for(int i = 0; i<programList.size(); i++){
            if(programList.get(i).getProgramID().equals(program.getProgramID())){
                programList.get(i).setDepartment(department);
                return true;
            }
        }
        return false;
    }

    public boolean displayProgramDepartment(Program program){
        System.out.println(program.getDepartmentName());
        return true;
    }

    public List<Program> getProgramList(){
        return programList;
    }
}
