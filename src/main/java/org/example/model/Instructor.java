package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person{
    private List<Course> coursesHandled = new ArrayList<>();
    private Program program = new Program("NULL", "NULL");

    public Instructor(){
        super();
    }

    public Instructor(String instructorID){
        super(instructorID);
    }

    public Instructor(String instructorID, String instructorName){
        super(instructorID, instructorName);
    }

    public Instructor(String instructorID, String instructorName, Course course){
        super(instructorID, instructorName);
        this.coursesHandled.add(course);
    }

    public boolean displayCoursesHandled(){
        System.out.println(coursesHandled);
        return true;
    }

    public void addCourse(Course course){
        this.coursesHandled.add(course);
    }

    public boolean removeCourse(Course course){
        for(int i = 0; i<coursesHandled.size(); i++){
            if(coursesHandled.get(i).getCourseID().equals(course.getCourseID())){
                coursesHandled.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getProgramName() {
        return this.program.getProgramName();
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public List<Course> getCoursesHandled(){
        return coursesHandled;
    }

    @Override
    public void mainTask() {
        System.out.println("I teach.");
    }

    @Override
    public String toString() {
        return "\n Instructor { " +
                "instructorID=" + super.getID() +
                "instructorName=" + super.getName() +
                "program=" + this.getProgramName() +
                "courses='" + coursesHandled.toString() + '\'' +
                " } ";
    }
}
