package org.example.service;

import org.example.model.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorRegistrationImpl {
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

    public List<Instructor> getInstructorList(){
        return instructorList;
    }
}
