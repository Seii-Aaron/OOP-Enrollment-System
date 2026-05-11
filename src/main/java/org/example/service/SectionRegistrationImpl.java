package org.example.service;

import org.example.model.Program;
import org.example.model.Section;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class SectionRegistrationImpl implements SectionRegistration{
    private List<Section> sectionList = new ArrayList<>();

    public void saveSection(String sectionID, String sectionName){
        sectionList.add(new Section(sectionID, sectionName));
    }

    public boolean displayAllSections(){
        System.out.println(sectionList);
        return true;
    }

    public boolean updateSection(String sectionID, String sectionName){
        for(int i = 0; i<sectionList.size(); i++){
            if(sectionList.get(i).getSectionID().equals(sectionID)){
                sectionList.set(i, new Section(sectionID, sectionName));
                return true;
            }
        }
        return false;
    }

    public boolean removeSection(String sectionID){
        for(int i = 0; i<sectionList.size(); i++){
            if(sectionList.get(i).getSectionID().equals(sectionID)){
                sectionList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean setProgramToSection(Program program, Section section){
        for(int i = 0; i<sectionList.size(); i++){
            if(sectionList.get(i).getSectionID().equals(section.getSectionID())){
                sectionList.get(i).setProgram(program);
                return true;
            }
        }
        return false;
    }

    public boolean displaySectionProgram(Section section){
        System.out.println(section.getProgramName());
        return true;
    }

    public boolean addStudentToSection(Student student, Section section){
        for(int i = 0; i<sectionList.size(); i++){
            if(sectionList.get(i).getSectionID().equals(section.getSectionID())){
                if(sectionList.get(i).getSectionStudentList().size()<sectionList.get(i).getMAX_NUMBER_OF_STUDENTS()){
                    sectionList.get(i).addStudentsToSection(student);
                    return true;
                }
            }
        }
        return false;
    }

    public List<Student> getSectionStudentList(Section section){
        return section.getSectionStudentList();
    }

    public List<Section> getSectionList(){
        return sectionList;
    }
}
