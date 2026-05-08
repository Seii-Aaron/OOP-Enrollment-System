package org.example.service;

import org.example.model.Program;

public class CampusRegistrar {
    private StudentRegistration studReg;
    private CourseRegistration courseReg;

    public CampusRegistrar(StudentRegistration studReg, CourseRegistration courseReg){
        this.studReg = studReg;
        this.courseReg = courseReg;
    }

    public String saveCourse(String courseID, String name, String program){
        courseReg.saveCourse(courseID, name, program);
        return "Success";
    }

    public String displayAllCourses(){
        courseReg.displayAllCourses();
        return "Success";
    }

    public String updateCourse(String courseID, String name, String program){
        boolean result = courseReg.updateCourse(courseID, name, program);
        if (result){
            return "Success";
        } else {
            return "Failed to update course. Please double-check the course ID.";
        }
    }

    public String removeCourse(String courseID){
        boolean result = courseReg.removeCourse(courseID);
        if (result){
            return "Success";
        } else {
            return "Failed to remove course. Please double-check the course ID.";
        }
    }

    public String saveStudent(String studentID, String name){
        studReg.saveStudent(studentID, name);
        return "Success";
    }

    public String displayAllStudent(){
        studReg.displayAllStudent();
        return "Success";
    }

    public String updateStudent(String studentID, String name){
        boolean result = studReg.updateStudent(studentID, name);
        if (result){
            return "Success";
        } else {
            return "Failed to update student. Please double-check the student ID.";
        }
    }

    public String removeStudent(String studentID){
        boolean result = studReg.removeStudent(studentID);
        if (result){
            return "Success";
        } else {
            return "Failed to remove student. Please double-check the student ID.";
        }
    }
}
