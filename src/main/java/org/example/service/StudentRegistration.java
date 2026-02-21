package org.example.service;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegistration {
    static Scanner scan = new Scanner(System.in);
    private ArrayList<Student> studentList = new ArrayList<>();

    public void saveStudent(Student student){
        studentList.add(student);
    }

    public void displayAllStudent(){
        System.out.println(studentList);
    }

    public void updateStudent(Student student){
        for(int i = 0; i< studentList.size(); i++){
            if(studentList.get(i).getStudentID().equals(student.getStudentID())){
                System.out.println("Enter name: ");
                String name = scan.nextLine();

                System.out.println("Enter program: ");
                String program = scan.nextLine();

                studentList.set(i, new Student(student.getStudentID(), name, program));
                break;
            }
        }
    }

    public String removeStudent(Student student){
        for(int i = 0; i< studentList.size(); i++){
            if(studentList.get(i).getStudentID().equals(student.getStudentID())){
                studentList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error.";
    }
}
