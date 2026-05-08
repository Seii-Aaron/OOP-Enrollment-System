package org.example.service;

import org.example.model.Program;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistrationImpl implements StudentRegistration{
    private List<Student> studentList = new ArrayList<>();

    public void saveStudent(String studentID, String name){
        studentList.add(new Student(studentID, name));
    }

    public boolean displayAllStudent(){
        System.out.println(studentList);
        return true;
    }

    public boolean updateStudent(String studentID, String name){
        for(int i = 0; i< studentList.size(); i++){
            if(studentList.get(i).getID().equals(studentID)){
                studentList.set(i, new Student(studentID, name));
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

    public boolean setStudentProgram(String studentID, Program program){
        for(int i = 0; i< studentList.size(); i++){
            if(studentList.get(i).getID().equals(studentID)){
                studentList.get(i).setProgram(program);
                return true;
            }
        }
        return false;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
