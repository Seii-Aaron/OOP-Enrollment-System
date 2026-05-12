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
        System.out.println();
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

    public boolean setInstructorProgram(String instructorID, Program program){
        if(program == null){
            return false;
        }
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
                System.out.println("Program of Instructor: " + instructorList.get(i).getProgramName());
                return true;
            }
        }
        return false;
    }

    public Instructor getInstructor(String instructorID){
        for(int i = 0; i< instructorList.size(); i++){
            if(instructorList.get(i).getID().equals(instructorID)){
                return instructorList.get(i);
            }
        }
        return null;
    }

    public boolean addCourseToInstructor(Course course, String instructorID){
        if(course == null){
            return false;
        }
        for(int i = 0; i< instructorList.size(); i++){
            if(instructorList.get(i).getID().equals(instructorID)){
                for(int j = 0; j<instructorList.get(i).getCoursesHandled().size(); j++){
                    if(instructorList.get(i).getCoursesHandled().get(j).getCourseID().equals(course.getCourseID())){
                        return false;
                    }
                }
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

    public boolean displayInstructorCourses(Instructor instructor){
        if(instructor == null){
            return false;
        }
        System.out.println(instructor.displayCoursesHandled());
        return true;
    }

    public List<Instructor> getInstructorList(){
        return instructorList;
    }
}
