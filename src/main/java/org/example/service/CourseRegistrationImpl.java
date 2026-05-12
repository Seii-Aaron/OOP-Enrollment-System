package org.example.service;

import org.example.model.Course;
import org.example.model.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseRegistrationImpl implements CourseRegistration{
    private List<Course> courseList = new ArrayList<>();

    public void saveCourse(String courseID, String name){
        courseList.add(new Course(courseID, name));
    }

    public boolean displayAllCourses(){
        System.out.println(courseList);
        return true;
    }

    public boolean updateCourse(String courseID, String name){
        for(int i = 0; i<courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(courseID)){
                courseList.set(i, new Course(courseID, name));
                return true;
            }
        }
        return false;
    }

    public boolean removeCourse(String courseID){
        for(int i = 0; i<courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(courseID)){
                courseList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean setCourseProgram(String courseID, Program program){
        for(int i = 0; i<courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(courseID)){
                courseList.get(i).setProgram(program);
                return true;
            }
        }
        return false;
    }

    public Course getCourse(String courseID){
        for(int i = 0; i<courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(courseID)){
                return courseList.get(i);
            }
        }
        return null;
    }


    public List<Course> getCourseList() {
        return courseList;
    }
}
