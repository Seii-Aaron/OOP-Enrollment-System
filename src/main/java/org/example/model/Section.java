package org.example.model;

public class Section {
    private String sectionID;
    private String sectionName;
    private String program;

    public Section(){

    }

    public Section(String sectionID){
        this.sectionID = sectionID;
    }

    public Section(String sectionID, String sectionName){
        this.sectionID = sectionID;
        this.sectionName = sectionName;
    }

    public Section(String sectionID, String sectionName, String program){
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

    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "\nSection { " +
                "sectionID='" + sectionID + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", program='" + program + '\'' +
                " } ";
    }
}
