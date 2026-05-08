package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String programID;
    private String programName;

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
                ", progCourseList=" + progCourseList +
                ", progSectionList=" + progSectionList +
                " } ";
    }
}
