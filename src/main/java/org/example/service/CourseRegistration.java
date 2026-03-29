package org.example.service;

import org.example.model.Course;

public interface CourseRegistration {
    void saveCourse(Course course);
    void displayAllCourses();
    void updateCourse(Course course);
    String removeCourse(Course course);
}
