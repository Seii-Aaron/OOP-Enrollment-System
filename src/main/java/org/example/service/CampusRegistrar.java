package org.example.service;

import org.example.model.Course;
import org.example.model.Student;

public class CampusRegistrar {
    private StudentRegistration studReg;
    private CourseRegistration courseReg;

    public CampusRegistrar(StudentRegistration studReg, CourseRegistration courseReg){
        this.studReg = studReg;
        this.courseReg =courseReg;
    }

    public String saveCourse(Course course){
        courseReg.saveCourse(course);
        return "Success";
    }

    public String displayAllCourses(){
        courseReg.displayAllCourses();
        return "Success";
    }

    public String updateCourse(Course course){
        courseReg.updateCourse(course);
        return "Success";
    }

    public String removeCourse(Course course){
        courseReg.removeCourse(course);
        return "Success";
    }

    public String saveStudent(Student student){
        studReg.saveStudent(student);
        return "Success";
    }

    public String displayAllStudent(){
        studReg.displayAllStudent();
        return "Success";
    }

    public String updateStudent(Student student){
        studReg.updateStudent(student);
        return "Success";
    }

    public String removeStudent(Student student){
        studReg.removeStudent(student);
        return "Success";
    }
}
