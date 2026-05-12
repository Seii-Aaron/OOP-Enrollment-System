package org.example.service;

import org.example.model.Course;
import org.example.model.Department;
import org.example.model.Program;
import org.example.model.Section;

import java.util.ArrayList;
import java.util.List;

public class ProgramRegistrationImpl implements ProgramRegistration{
    private List<Program> programList = new ArrayList<>();

    public void saveProgram(String programID, String programName){
        programList.add(new Program(programID, programName));
    }

    public boolean displayAllPrograms(){
        System.out.println(programList);
        System.out.println();
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

    public boolean addCourseToProgram(Program program, Course course){
        if (program == null) {
            return false;
        }
        if (course == null) {
            return false;
        }
        for(int i = 0; i<programList.size(); i++){
            if(programList.get(i).getProgramID().equals(program.getProgramID())){
                for(int j = 0; j<programList.get(i).getProgCourseList().size(); j++){
                    if(programList.get(i).getProgCourseList().get(j).getCourseID().equals(course.getCourseID())){
                        return false;
                    }
                }
                programList.get(i).addCourseToProgram(course);
                return true;
            }
        }
        return false;
    }

    public boolean removeCourseFromProgram(Program program, Course course){
        if (program == null) {
            return false;
        }
        if (course == null) {
            return false;
        }
        for(int i = 0; i<programList.size(); i++){
            if(programList.get(i).getProgramID().equals(program.getProgramID())){
                for(int j = 0; j<programList.get(i).getProgCourseList().size(); j++){
                    if(programList.get(i).getProgCourseList().get(j).getCourseID().equals(course.getCourseID())){
                        programList.get(i).getProgCourseList().remove(j);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean addSectionToProgram(Program program, Section section){
        if (program == null) {
            return false;
        }
        if (section == null) {
            return false;
        }
        for(int i = 0; i<programList.size(); i++){
            if(programList.get(i).getProgramID().equals(program.getProgramID())){
                for(int j = 0; j<programList.get(i).getProgSectionList().size(); j++){
                    if(programList.get(i).getProgSectionList().get(j).getSectionID().equals(section.getSectionID())){
                        return false;
                    }
                }
                programList.get(i).addSectionToProgram(section);
                return true;
            }
        }
        return false;
    }

    public boolean removeSectionFromProgram(Program program, Section section){
        if (program == null) {
            return false;
        }
        if (section == null) {
            return false;
        }
        for(int i = 0; i<programList.size(); i++){
            if(programList.get(i).getProgramID().equals(program.getProgramID())){
                for(int j = 0; j<programList.get(i).getProgSectionList().size(); j++){
                    if(programList.get(i).getProgSectionList().get(j).getSectionID().equals(section.getSectionID())){
                        programList.get(i).getProgSectionList().remove(j);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Program getProgram(String programID){
        for(int i = 0; i<programList.size(); i++){
            if(programList.get(i).getProgramID().equals(programID)){
                return programList.get(i);
            }
        }
        return null;
    }

    public List<Program> getProgramList(){
        return programList;
    }
}
