package org.example.service;

import org.example.model.Program;
import org.example.model.Section;

import java.util.List;

public interface SectionRegistration {
    void saveSection(String sectionID, String sectionName, Program program);
    boolean displayAllSections();
    boolean updateSection(String sectionID, String sectionName, Program program);
    boolean removeSection(String sectionID);
    boolean setProgramToSection(Program program, Section section);
    boolean displaySectionProgram(Section section);
    List<Section> getSectionList();
}
