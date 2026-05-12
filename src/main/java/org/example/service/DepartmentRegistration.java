package org.example.service;

import org.example.model.Department;
import org.example.model.Instructor;
import org.example.model.Program;

import java.util.List;

public interface DepartmentRegistration {
    public void saveDepartment(String departmentID, String departmentName);
    public boolean displayAllDepartments();
    public boolean displayAllDepartmentPrograms(Department department);
    public boolean displayAllDepartmentInstructors(Department department);
    public boolean updateDepartment(String departmentID, String departmentName);
    public boolean removeDepartment(String departmentID);
    public boolean addProgramToDepartment(Department department, Program program);
    public boolean removeProgramFromDepartment(Department department, Program program);
    public boolean addInstructorToDepartment(Department department, Instructor instructor);
    public boolean removeInstructorFromDepartment(Department department, Instructor instructor);
    public Department getDepartment(String departmentID);
    public List<Department> getDepartmentList();
}