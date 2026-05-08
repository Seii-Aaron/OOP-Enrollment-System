package org.example.service;

import org.example.model.Department;

import java.util.List;

public interface DepartmentRegistration {
    public void saveDepartment(String departmentID, String departmentName);
    public boolean displayAllDepartments();
    public boolean updateDepartment(String departmentID, String departmentName);
    public boolean removeDepartment(String departmentID);
    public List<Department> getDepartmentList();
}
