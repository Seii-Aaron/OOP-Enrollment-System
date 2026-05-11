package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String programID;
    private String programName;

    private Department department = new Department("NULL", "NULL");
    private List<Course> progCourseList = new ArrayList<>();
    private List<Section> progSectionList = new ArrayList<>();

    public Program(){

    }

    public Program(String programID) {
        this.programID = programID;
    }

    public Program(String programID, String programName) {
        this.programID = programID;
        this.programName = programName;
    }

    public Program(String programID, String programName, Department department) {
        this.programID = programID;
        this.programName = programName;
        this.department = department;
    }

    public String getProgramID() {
        return programID;
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDepartmentName() {
        return this.department.getDepartmentName();
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Course> getProgCourseList() {
        return progCourseList;
    }

    public List<Section> getProgSectionList() {
        return progSectionList;
    }


    @Override
    public String toString() {
        return "\n Program { " +
                "programID='" + programID + '\'' +
                ", programName='" + programName + '\'' +
                ", department=" + this.getDepartmentName() +
                ", progCourseList=" + progCourseList +
                ", progSectionList=" + progSectionList +
                " } ";
    }
}
