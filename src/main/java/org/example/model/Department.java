package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentID;
    private String departmentName;

    private List<Program> deptProgramList = new ArrayList<>();
    private List<Instructor> deptInstructorList = new ArrayList<>();

    public Department(){

    }

    public Department(String departmentID) {
        this.departmentID = departmentID;
    }

    public Department(String departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }


    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Program> getDeptProgramList() {
        return deptProgramList;
    }

    public List<Instructor> getDeptInstructorList() {
        return deptInstructorList;
    }


    @Override
    public String toString() {
        return "\nDepartment { " +
                "departmentID='" + departmentID + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", deptProgramList=" + deptProgramList +
                ", deptInstructorList=" + deptInstructorList +
                " } ";
    }
}
