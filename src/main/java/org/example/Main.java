package org.example;

public class Main{
    public static void main(String[] args) {
        Student s = new Student();
        Course c = new Course();

        s.setStudentID("123");
        s.setStudentName("Jusip");
        s.setProgram("BSIT");

        c.setCourseID("1001");
        c.setCourseName("InteProg");
        c.setProgram("Information Technology");

        s.display();
        c.display();
    }
}
