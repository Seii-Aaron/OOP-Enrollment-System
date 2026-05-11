package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private String sectionID;
    private String sectionName;
    private Program program = new Program("NULL", "NULL");
    private final int MAX_NUMBER_OF_STUDENTS = 30;
    private List<Student> sectionStudentList = new ArrayList<>();

    public Section(){

    }

    public Section(String sectionID){
        this.sectionID = sectionID;
    }

    public Section(String sectionID, String sectionName){
        this.sectionID = sectionID;
        this.sectionName = sectionName;
    }

    public Section(String sectionID, String sectionName, Program program){
        this.sectionID = sectionID;
        this.sectionName = sectionName;
        this.program = program;
    }

    public String getSectionID() {
        return sectionID;
    }
    public void setSectionID(String sectionID) {
        this.sectionID = sectionID;
    }

    public String getSectionName() {
        return sectionName;
    }
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Program getProgramName() {
        return this.getProgramName();
    }
    public void setProgram(Program program) {
        this.program = program;
    }

    public void addStudentsToSection(Student student){
        sectionStudentList.add(student);
    }

    public int getMAX_NUMBER_OF_STUDENTS() {
        return MAX_NUMBER_OF_STUDENTS;
    }

    public List<Student> getSectionStudentList() {
        return sectionStudentList;
    }

    @Override
    public String toString() {
        return "\nSection { " +
                "sectionID='" + sectionID + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", program='" + this.getProgramName() + '\'' +
                " } ";
    }
}
