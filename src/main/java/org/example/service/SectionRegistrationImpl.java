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
        System.out.println();
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
        if(program == null){
            return false;
        }
        if (section == null) {
            return false;
        }
        for(int i = 0; i<sectionList.size(); i++){
            if(sectionList.get(i).getSectionID().equals(section.getSectionID())){
                sectionList.get(i).setProgram(program);
                return true;
            }
        }
        return false;
    }

    public boolean displaySectionProgram(Section section){
        if(section == null){
            return false;
        }
        System.out.println("Program of Section: " + section.getProgramName());
        return true;
    }

    public boolean displayNumberOfStudentsEnrolled(Section section){
        if(section == null){
            return false;
        }
        System.out.println("Number of Students enrolled in Section: " + section.getSectionStudentList().size());
        return true;
    }

    // Temporary
    // Setting student's program needs to be fixed
    public boolean addStudentToSection(Student student, Section section){
        if(student == null){
            return false;
        }
        if (section == null) {
            return false;
        }
        for(int i = 0; i<sectionList.size(); i++){
            if(sectionList.get(i).getSectionID().equals(section.getSectionID())){
                for(int j = 0; j<sectionList.get(i).getSectionStudentList().size(); j++){
                    if(sectionList.get(i).getSectionStudentList().get(j).getID().equals(student.getID())){
                        return false;
                    }
                }
                sectionList.get(i).addStudentsToSection(student);
                student.setSection(sectionList.get(i));
                student.setProgram(sectionList.get(i).getProgram());
                return true;
            }
        }
        return false;
    }

    public boolean removeStudentFromSection(Student student, Section section){
        if(student == null){
            return false;
        }
        if (section == null) {
            return false;
        }
        for(int i = 0; i<sectionList.size(); i++){
            if(sectionList.get(i).getSectionID().equals(section.getSectionID())){
                for(int j = 0; j<sectionList.get(i).getSectionStudentList().size(); j++){
                    if(sectionList.get(i).getSectionStudentList().get(j).getID().equals(student.getID())){
                        sectionList.get(i).getSectionStudentList().remove(j);
                        student.setSection(new Section("NULL", "NULL"));
                        student.setProgram(new Program("NULL", "NULL"));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Section getSection(String sectionID){
        for(int i = 0; i<sectionList.size(); i++){
            if(sectionList.get(i).getSectionID().equals(sectionID)){
                return sectionList.get(i);
            }
        }
        return null;
    }


    public List<Student> getSectionStudentList(Section section){
        return section.getSectionStudentList();
    }

    public List<Section> getSectionList(){
        return sectionList;
    }
}
