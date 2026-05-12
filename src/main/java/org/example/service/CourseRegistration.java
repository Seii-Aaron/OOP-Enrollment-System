package org.example.service;

import org.example.model.Course;
import org.example.model.Program;

import java.util.List;

public interface CourseRegistration {
    void saveCourse(String courseID, String name);
    boolean displayAllCourses();
    boolean updateCourse(String courseID, String name);
    boolean removeCourse(String courseID);
    boolean setCourseProgram(String courseID, Program program);
    Course getCourse(String courseID);
    List<Course> getCourseList();
}
