package org.example.service;

import org.example.model.Course;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistration {
    static Scanner scan = new Scanner(System.in);
    private ArrayList<Course> courseList = new ArrayList<>();

    public void save(Course course){
        courseList.add(course);
    }

    public void displayAll(){
        System.out.println(courseList);
    }

    public void updateCourse(Course course){
        for(int i = 0; i<courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(course.getCourseID())){
                System.out.println("Enter name: ");
                String name = scan.nextLine();

                System.out.println("Enter program: ");
                String program = scan.nextLine();

                courseList.set(i, new Course(course.getCourseID(), name, program));
                break;
            }
        }
    }

    public String removeCourse(Course course){
        for(int i = 0; i<courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(course.getCourseID())){
                courseList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error.";
    }
}
