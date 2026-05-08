package org.example.service;

import org.example.model.Course;
import org.example.model.Section;

import java.util.ArrayList;
import java.util.List;

public class SectionRegistrationImpl {
    private List<Section> sectionList = new ArrayList<>();

    public void saveSection(String sectionID, String sectionName, String program){
        sectionList.add(new Section(sectionID, sectionName, program));
    }

    public boolean displayAllSections(){
        System.out.println(sectionList);
        return true;
    }

    public boolean updateSection(String sectionID, String sectionName, String program){
        for(int i = 0; i<sectionList.size(); i++){
            if(sectionList.get(i).getSectionID().equals(sectionID)){
                sectionList.set(i, new Section(sectionID, sectionName, program));
                return true;
            }
        }
        return false;
    }

    public boolean removeSection(String sectionID){
        for(int i = 0; i<sectionList.size(); i++){
            if(sectionList.get(i).getSectionID().equals(sectionID)){
                sectionList.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Section> getSectionList(){
        return sectionList;
    }
}
