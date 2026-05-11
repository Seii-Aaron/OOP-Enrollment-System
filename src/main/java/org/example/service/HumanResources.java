package org.example.service;

import org.example.model.Course;
import org.example.model.Department;
import org.example.model.Instructor;
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

    public String saveDepartment(String departmentID, String departmentName){
        departmentReg.saveDepartment(departmentID, departmentName);
        return "Success";
    }

    public String displayAllDepartments(){
        departmentReg.displayAllDepartments();
        return "Success";
    }


    public String updateDepartment(String departmentID, String departmentName){
        boolean result = departmentReg.updateDepartment(departmentID, departmentName);
        if(result){
            return "Success";
        } else {
            return "Failed updating department.";
        }
    }


    public String removeDepartment(String departmentID){
        boolean result = departmentReg.removeDepartment(departmentID);
        if(result){
            return "Success";
        } else {
            return "Failed removing department.";
        }
    }


    public List<Department> getDepartmentList(){
        return departmentReg.getDepartmentList();
    }

    public String saveInstructor(String instructorID, String name){
        instructorReg.saveInstructor(instructorID, name);
        return "Success";
    }

    public String displayAllInstructors(){
        instructorReg.displayAllInstructors();
        return "Success";
    }

    public String updateInstructor(String instructorID, String name){
        boolean result = instructorReg.updateInstructor(instructorID, name);
        if(result){
            return "Success";
        } else {
            return "Failed updating instructor.";
        }
    }

    public String removeInstructor(String instructorID){
        boolean result = instructorReg.removeInstructor(instructorID);
        if(result){
            return "Success";
        } else {
            return "Failed removing instructor.";
        }
    }

    public String addCourseToInstructor(Course course, String instructorID){
        boolean result = instructorReg.addCourseToInstructor(course, instructorID);
        if(result){
            return "Success";
        } else {
            return "Failed adding course to instructor.";
        }
    }

    public String removeCourseFromInstructor(Course course, String instructorID){
        boolean result = instructorReg.removeCourseFromInstructor(course, instructorID);
        if(result){
            return "Success";
        } else {
            return "Failed removing course from instructor.";
        }
    }

    public String displayInstructorCourses(Instructor instructor){
        instructorReg.displayInstructorCourses(instructor);
        return "Success";
    }

    public List<Instructor> getInstructorList(){
        return instructorReg.getInstructorList();
    }


}
