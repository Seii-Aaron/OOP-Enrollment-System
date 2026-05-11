package org.example.model;

public class Course {
    private String courseID;
    private String courseName;
    private Program program;

    public Course(){

    }

    public Course(String courseID){
        this.courseID = courseID;
    }

    public Course(String courseID, String courseName){
        this.courseID = courseID;
        this.courseName = courseName;
    }

    public Course(String courseID, String courseName, Program program){
        this.courseID = courseID;
        this.courseName = courseName;
        this.program = program;
    }

    public String getCourseID(){
        return courseID;
    }
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getProgramName(){
        return program.getProgramName();
    }
    public void setProgram(Program program){
        this.program = program;
    }

    @Override
    public String toString() {
        return "\nCourse { " +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", program='" + program + '\'' +
                " } ";
    }
}
