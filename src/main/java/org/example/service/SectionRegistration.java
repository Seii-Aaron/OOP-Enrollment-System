package org.example.service;

import org.example.model.Section;

import java.util.List;

public interface SectionRegistration {
    void saveSection(String sectionID, String sectionName, String program);
    boolean displayAllSections();
    boolean updateSection(String sectionID, String sectionName, String program);
    boolean removeSection(String sectionID);
    List<Section> getSectionList();
}
