package org.example;

import org.example.model.Course;
import org.example.model.Student;

public class Main{
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentID("123");
        s.setStudentName("Jusip");
        s.setProgram("BSIT");

        Course c = new Course();
        c.setCourseID("1001");
        c.setCourseName("InteProg");
        c.setProgram("Information Technology");


    }
}
