package org.example.model;

public class Instructor extends Person{
    private String course;

    public Instructor(){
        super();
    }

    public Instructor(String instructorID){
        super(instructorID);
    }

    public Instructor(String instructorID, String instructorName){
        super(instructorID, instructorName);
    }

    public Instructor(String instructorID, String instructorName, String course){
        super(instructorID, instructorName);
        this.course = course;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorID=" + super.getID() +
                "instructorName=" + super.getName() +
                "course='" + course + '\'' +
                '}';
    }
}
