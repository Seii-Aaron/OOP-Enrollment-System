package org.example.service;

import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Program;

import java.util.ArrayList;
import java.util.List;

public class InstructorRegistrationImpl implements InstructorRegistration{
    private List<Instructor> instructorList = new ArrayList<>();

    public void saveInstructor(String instructorID, String instructorName){
        instructorList.add(new Instructor(instructorID, instructorName));
    }

    public boolean displayAllInstructors(){
        System.out.println(instructorList);
        return true;
    }

    public boolean updateInstructor(String instructorID, String instructorName){
        for(int i = 0; i< instructorList.size(); i++){
            if(instructorList.get(i).getID().equals(instructorID)){
                instructorList.set(i, new Instructor(instructorID, instructorName));
                return true;
            }
        }
        return false;
    }

    public boolean removeInstructor(String instructorID){
        for(int i = 0; i< instructorList.size(); i++){
            if(instructorList.get(i).getID().equals(instructorID)){
                instructorList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean setProgram(String instructorID, Program program){
        for(int i = 0; i< instructorList.size(); i++){
            if(instructorList.get(i).getID().equals(instructorID)){
                instructorList.get(i).setProgram(program);
                return true;
            }
        }
        return false;
    }

    public boolean displayInstructorProgram(String instructorID){
        for(int i = 0; i< instructorList.size(); i++){
            if(instructorList.get(i).getID().equals(instructorID)){
                System.out.println(instructorList.get(i).getProgramName());
                return true;
            }
        }
        return false;
    }

    public boolean addCourseToInstructor(Course course, String instructorID){
        for(int i = 0; i< instructorList.size(); i++){
            if(instructorList.get(i).getID().equals(instructorID)){
                instructorList.get(i).addCourse(course);
                return true;
            }
        }
        return false;
    }

    public boolean removeCourseFromInstructor(Course course, String instructorID){
        for(int i = 0; i< instructorList.size(); i++){
            if(instructorList.get(i).getID().equals(instructorID)){
                instructorList.get(i).removeCourse(course);
                return true;
            }
        }
        return false;
    }

    public void displayInstructorCourses(Instructor instructor){
        System.out.println(instructor.displayCoursesHandled());
    }

    public List<Instructor> getInstructorList(){
        return instructorList;
    }
}
