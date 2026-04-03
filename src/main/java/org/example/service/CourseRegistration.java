package org.example.service;

import org.example.model.Course;

import java.util.List;

public interface CourseRegistration {
    void saveCourse(String courseID, String name, String program);
    boolean displayAllCourses();
    boolean updateCourse(String courseID, String name, String program);
    boolean removeCourse(String courseID);
    List<Course> getCourseList();
}
