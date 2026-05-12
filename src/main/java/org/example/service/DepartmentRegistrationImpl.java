package org.example.service;

import org.example.model.Department;
import org.example.model.Instructor;
import org.example.model.Program;

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

    public boolean displayAllDepartmentPrograms(Department department){
        if (department == null) {
            return false;
        }
        System.out.println(department.getDeptProgramList());
        System.out.println();
        return true;
    }

    public boolean displayAllDepartmentInstructors(Department department){
        if (department == null) {
            return false;
        }
        System.out.println(department.getDeptInstructorList());
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

    public boolean addProgramToDepartment(Department department, Program program){
        if (department == null) {
            return false;
        }
        if (program == null) {
            return false;
        }
        for(int i = 0; i<departmentList.size(); i++){
            if(departmentList.get(i).getDepartmentID().equals(department.getDepartmentID())){
                for(int j = 0; j<departmentList.get(i).getDeptProgramList().size(); j++){
                    if(departmentList.get(i).getDeptProgramList().get(j).getProgramID().equals(program.getProgramID())){
                        return false;
                    }
                }
                departmentList.get(i).addProgramToDepartment(program);
                program.setDepartment(department);
                return true;
            }
        }
        return false;
    }

    public boolean removeProgramFromDepartment(Department department, Program program){
        if (department == null) {
            return false;
        }
        if (program == null) {
            return false;
        }
        for(int i = 0; i<departmentList.size(); i++){
            if(departmentList.get(i).getDepartmentID().equals(department.getDepartmentID())){
                for(int j = 0; j<departmentList.get(i).getDeptProgramList().size(); j++){
                    if(departmentList.get(i).getDeptProgramList().get(j).getProgramID().equals(program.getProgramID())){
                        departmentList.get(i).getDeptProgramList().remove(j);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean addInstructorToDepartment(Department department, Instructor instructor){
        if (department == null) {
            return false;
        }
        if (instructor == null) {
            return false;
        }
        for(int i = 0; i<departmentList.size(); i++){
            if(departmentList.get(i).getDepartmentID().equals(department.getDepartmentID())){
                for(int j = 0; j<departmentList.get(i).getDeptInstructorList().size(); j++){
                    if(departmentList.get(i).getDeptInstructorList().get(j).getID().equals(instructor.getID())){
                        return false;
                    }
                }
                departmentList.get(i).addInstructorToDepartment(instructor);
                return true;
            }
        }
        return false;
    }

    public boolean removeInstructorFromDepartment(Department department, Instructor instructor){
        if (department == null) {
            return false;
        }
        if (instructor == null) {
            return false;
        }
        for(int i = 0; i<departmentList.size(); i++){
            if(departmentList.get(i).getDepartmentID().equals(department.getDepartmentID())){
                for(int j = 0; j<departmentList.get(i).getDeptInstructorList().size(); j++){
                    if(departmentList.get(i).getDeptInstructorList().get(j).getID().equals(instructor.getID())){
                        departmentList.get(i).getDeptInstructorList().remove(j);
                        return true;
                    }
                }
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
