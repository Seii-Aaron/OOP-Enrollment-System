package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private Program program = new Program("NULL", "NULL");
    private Section section;
    private List<Payment> payments = new ArrayList<>();

    public Student(){
        super();
    }

    public Student(String studentID){
        super(studentID);
    }

    public Student(String studentID, String studentName){
        super(studentID, studentName);
    }

    public Student(String studentID, String studentName, Program program){
        super(studentID, studentName);
        this.program = program;
    }

    public String getProgramName(){
        return this.program.getProgramName();
    }

    public void setProgram(Program program){
        this.program = program;
    }

    @Override
    public void mainTask() {
        System.out.println("I study.");
    }

    @Override
    public String toString() {
        return "\nStudent { " +
                "studentID='" + super.getID() + '\'' +
                ", studentName='" + super.getName() + '\'' +
                ", program='" + program + '\'' +
                " } ";
    }
}
