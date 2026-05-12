package org.example.service;

import org.example.model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRegistrationImpl implements DepartmentRegistration{
    private List<Department> departmentList = new ArrayList<>();

    public void saveDepartment(String departmentID, String departmentName){
        departmentList.add(new Department(departmentID, departmentName));
    }

    public boolean displayAllDepartments(){
        System.out.println(departmentList);
        System.out.println();
        return true;
    }

    public boolean updateDepartment(String departmentID, String departmentName){
        for(int i = 0; i<departmentList.size(); i++){
            if(departmentList.get(i).getDepartmentID().equals(departmentID)){
                departmentList.set(i, new Department(departmentID, departmentName));
                return true;
            }
        }
        return false;
    }

    public boolean removeDepartment(String departmentID){
        for(int i = 0; i<departmentList.size(); i++){
            if(departmentList.get(i).getDepartmentID().equals(departmentID)){
                departmentList.remove(i);
                return true;
            }
        }
        return false;
    }

    public Department getDepartment(String departmentID){
        for(int i = 0; i<departmentList.size(); i++){
            if(departmentList.get(i).getDepartmentID().equals(departmentID)){
                return departmentList.get(i);
            }
        }
        return null;
    }

    public List<Department> getDepartmentList(){
        return departmentList;
    }
}
