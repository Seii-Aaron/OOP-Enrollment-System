package org.example.service;

import org.example.model.Course;

import java.util.List;

public interface CourseRegistration {
    void saveCourse(String courseID, String name);
    boolean displayAllCourses();
    boolean updateCourse(String courseID, String name);
    boolean removeCourse(String courseID);
    List<Course> getCourseList();
}
