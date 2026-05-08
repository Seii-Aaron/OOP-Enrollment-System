package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person{
    private List<Course> coursesHandled = new ArrayList<>();

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

    public List<Course> getCoursesHandled(){
        return coursesHandled;
    }

    @Override
    public void mainTask() {
        System.out.println("I teach.");
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorID=" + super.getID() +
                "instructorName=" + super.getName() +
                "courses='" + coursesHandled.toString() + '\'' +
                '}';
    }
}
