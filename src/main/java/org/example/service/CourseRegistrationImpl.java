package org.example.service;

import org.example.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseRegistrationImpl implements CourseRegistration{
    private List<Course> courseList = new ArrayList<>();

    public void saveCourse(String courseID, String name, String program){
        courseList.add(new Course(courseID, name, program));
    }

    public boolean displayAllCourses(){
        System.out.println(courseList);
        return true;
    }

    public boolean updateCourse(String courseID, String name, String program){
        for(int i = 0; i<courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(courseID)){
                courseList.set(i, new Course(courseID, name, program));
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

    public List<Course> getCourseList() {
        return courseList;
    }
}
