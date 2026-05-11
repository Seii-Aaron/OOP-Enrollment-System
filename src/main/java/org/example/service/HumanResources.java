package org.example.service;

import org.example.model.Course;
import org.example.model.Department;
import org.example.model.Program;

import java.util.List;

public class HumanResources {
    private CourseRegistration courseReg;
    private DepartmentRegistration departmentReg;
    private InstructorRegistration instructorReg;
    private ProgramRegistration programReg;
    private SectionRegistration sectionReg;

    public HumanResources(CourseRegistration courseReg, DepartmentRegistration departmentReg, InstructorRegistration instructorReg, ProgramRegistration programReg, SectionRegistration sectionReg) {
        this.courseReg = courseReg;
        this.departmentReg = departmentReg;
        this.instructorReg = instructorReg;
        this.programReg = programReg;
        this.sectionReg = sectionReg;
    }

    public String saveCourse(String courseID, String name){
        courseReg.saveCourse(courseID, name);
        return "Success";
    }

    public String displayAllCourses(){
        boolean result = courseReg.displayAllCourses();
        return "Success";
    }

    public String updateCourse(String courseID, String name){
        boolean result = courseReg.updateCourse(courseID, name);
        if(result){
            return "Success";
        } else {
            return "Failed updating course.";
        }
    }

    public String removeCourse(String courseID){
        boolean result = courseReg.removeCourse(courseID);
        if(result){
            return "Success";
        } else {
            return "Failed removing course.";
        }
    }


    public String setCourseProgram(String courseID, Program program){
        boolean result = courseReg.setCourseProgram(courseID, program);
        if(result){
            return "Success";
        } else {
            return "Failed setting program to course.";
        }
    }

    public List<Course> getCourseList(){
        return courseReg.getCourseList();
    }

    public void saveDepartment(String departmentID, String departmentName);
    public boolean displayAllDepartments();
    public boolean updateDepartment(String departmentID, String departmentName);
    public boolean removeDepartment(String departmentID);
    public List<Department> getDepartmentList();
}
