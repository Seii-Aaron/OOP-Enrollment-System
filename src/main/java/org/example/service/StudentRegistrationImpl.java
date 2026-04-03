package org.example.service;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRegistrationImpl implements StudentRegistration{
    private List<Student> studentList = new ArrayList<>();

    public void saveStudent(String studentID, String name, String program){
        studentList.add(new Student(studentID, name, program));
    }

    public boolean displayAllStudent(){
        System.out.println(studentList);
        return true;
    }

    public boolean updateStudent(String studentID, String name, String program){
        for(int i = 0; i< studentList.size(); i++){
            if(studentList.get(i).getID().equals(studentID)){
                studentList.set(i, new Student(studentID, name, program));
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(String studentID){
        for(int i = 0; i< studentList.size(); i++){
            if(studentList.get(i).getID().equals(studentID)){
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
