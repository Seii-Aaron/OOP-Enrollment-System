package org.example.service;

import org.example.model.Program;
import org.example.model.Section;
import org.example.model.Student;

import java.util.List;

public interface SectionRegistration {
    void saveSection(String sectionID, String sectionName);
    boolean displayAllSections();
    boolean updateSection(String sectionID, String sectionName);
    boolean removeSection(String sectionID);
    boolean setProgramToSection(Program program, Section section);
    boolean displaySectionProgram(Section section);
    boolean displayNumberOfStudentsEnrolled(Section section);
    boolean addStudentToSection(Student student, Section section);
    boolean removeStudentFromSection(Student student, Section section);
    Section getSection(String sectionID);
    List<Student> getSectionStudentList(Section section);
    List<Section> getSectionList();
}
