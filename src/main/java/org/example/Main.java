// hello sirrr
// di ko po natapos yung code ngayon, plano ko po tapusin to bukas
// sorry po sir, kahit ito na lang po gradean nyo
// thank you so much po!!!


package org.example;

import org.example.service.*;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        HumanResources humanResources = new HumanResources(new CourseRegistrationImpl(), new DepartmentRegistrationImpl(), new InstructorRegistrationImpl(), new ProgramRegistrationImpl(), new SectionRegistrationImpl());
        CampusRegistrar campusRegistrar = new CampusRegistrar(new StudentRegistrationImpl(), new TuitionServiceImpl());

        //interactive
        while (true) {
            System.out.print("\nPick a number.\n" +
                    "1. Student Registration\n" +
                    "2. Course Registration\n" +
                    "3. Tuition Service\n" +
                    "4. Section Registration\n" +
                    "5. Instructor Registration\n" +
                    "6. Program Registration\n" +
                    "7. Department Registration\n" +
                    "8. Exit\n" +
                    "Answer: ");

            int num1 = scan.nextInt();

            if (num1 == 1) {
                System.out.print("\nStudent Registration:\n" +
                        "Pick a number.\n" +
                        "1. Save Student\n" +
                        "2. Display Student\n" +
                        "3. Update Student\n" +
                        "4. Remove Student\n" +
                        "5. Set Program of Student\n" +
                        "6. Set Section of Student\n" +
                        "7. Display Payments of Student\n" +
                        "8. Back to Menu\n" +
                        "Answer: ");
                int srNum = scan.nextInt();
                scan.nextLine();
                switch (srNum) {
                    case 1:
                        System.out.println("\nSave Student.");
                        System.out.println("Enter Student ID: ");
                        String studID = scan.nextLine();

                        System.out.println("Enter Student Name: ");
                        String studName = scan.nextLine();

                        System.out.println(campusRegistrar.saveStudent(studID, studName));
                        break;

                    case 2:
                        campusRegistrar.displayAllStudent();
                        break;

                    case 3:
                        campusRegistrar.displayAllStudent();
                        System.out.println("Update Student.");
                        System.out.println("Enter Student ID: ");
                        String newStudID = scan.nextLine();
                        System.out.println("Enter name: ");
                        String newName = scan.nextLine();
                        System.out.println(campusRegistrar.updateStudent(newStudID, newName));
                        break;

                    case 4:
                        campusRegistrar.displayAllStudent();
                        System.out.println("Remove Student.");
                        System.out.println("Enter Student ID: ");
                        String delStudID = scan.nextLine();
                        System.out.println(campusRegistrar.removeStudent(delStudID));
                        break;

                    case 5:
                        campusRegistrar.displayAllStudent();
                        System.out.println("Set Program to Student.");
                        System.out.println("Enter Student ID: ");
                        String studID2 = scan.nextLine();
                        humanResources.displayAllPrograms();
                        System.out.println("Enter program ID: ");
                        String progID = scan.nextLine();
                        System.out.println(campusRegistrar.setStudentProgram(studID2, humanResources.getProgram(progID)));
                        break;

                    case 6:
                        campusRegistrar.displayAllStudent();
                        System.out.println("Set Section to Student.");
                        System.out.println("Enter Student ID: ");
                        String studID3 = scan.nextLine();
                        humanResources.displayAllSections();
                        System.out.println("Enter Section ID: ");
                        String sectionID = scan.nextLine();
                        System.out.println(campusRegistrar.setStudentSection(studID3, humanResources.getSection(sectionID)));
                        break;

                    case 7:
                        campusRegistrar.displayAllStudent();
                        System.out.println("Display a Student's payments");
                        System.out.println("Enter Student ID: ");
                        String studID4 = scan.nextLine();
                        System.out.println(campusRegistrar.displayStudentPayments(studID4));
                        break;

                    case 8:
                        break;

                    default:
                        System.out.println("Error.");
                        break;
                }


            } else if (num1 == 2) {
                System.out.print("\nCourse Registration:\n" +
                        "Pick a number.\n" +
                        "1. Save Course\n" +
                        "2. Display Course\n" +
                        "3. Update Course\n" +
                        "4. Remove Course\n" +
                        "5. Set Program of Course\n" +
                        "6. Back to Menu\n" +
                        "Answer: ");
                int crNum = scan.nextInt();
                scan.nextLine();
                switch (crNum) {
                    case 1:
                        System.out.println("\nSave Course.");
                        System.out.println("Enter Course ID: ");
                        String courseID = scan.nextLine();

                        System.out.println("Enter Course Name: ");
                        String courseName = scan.nextLine();

                        System.out.println(humanResources.saveCourse(courseID, courseName));
                        break;

                    case 2:
                        humanResources.displayAllCourses();
                        break;

                    case 3:
                        humanResources.displayAllCourses();
                        System.out.println("Update Course.");
                        System.out.println("Enter Course ID: ");
                        String newCourseID = scan.nextLine();
                        System.out.println("Enter name: ");
                        String newName = scan.nextLine();
                        System.out.println(humanResources.updateCourse(newCourseID, newName));
                        break;

                    case 4:
                        humanResources.displayAllCourses();
                        System.out.println("Remove Course.");
                        System.out.println("Enter Course ID: ");
                        String delCourseID = scan.nextLine();
                        System.out.println(humanResources.removeCourse(delCourseID));
                        break;

                    case 5:
                        humanResources.displayAllCourses();
                        System.out.println("Set Program of Course.");
                        System.out.println("Enter Course ID: ");
                        String courseID2 = scan.nextLine();
                        humanResources.displayAllPrograms();
                        System.out.println("Enter Program ID: ");
                        String progID = scan.nextLine();
                        System.out.println(humanResources.setCourseProgram(courseID2, humanResources.getProgram(progID)));
                        break;

                    case 6:
                        break;

                    default:
                        System.out.println("Error.");
                        break;
                }


            } else if (num1 == 3){
                System.out.print("\nTuition Service:\n" +
                        "Pick a number.\n" +
                        "1. Create New Payment Transaction\n" +
                        "2. Calculate Tuition Fee\n" +
                        "3. Make Payment\n" +
                        "4. Get Balance\n" +
                        "5. Assign Student to Payment\n" +
                        "6. Check Payment Status\n" +
                        "7. Back to Menu\n" +
                        "Answer: ");
                int srNum = scan.nextInt();
                scan.nextLine();
                switch (srNum) {
                    case 1:
                        System.out.println("\nCreate New Payment Transaction");
                        System.out.println("Enter Payment ID: ");
                        String paymentID = scan.nextLine();
                        campusRegistrar.displayAllStudent();
                        System.out.println("Select Student");
                        System.out.println("Enter Student ID: ");
                        String studentID = scan.nextLine();
                        System.out.println(campusRegistrar.savePayment(paymentID, campusRegistrar.getStudent(studentID)));
                        break;

                    case 2:
                        campusRegistrar.displayAllPayments();
                        System.out.println("Calculate Tuition Fee of a Payment");
                        System.out.println("Select Payment");
                        System.out.println("Enter Payment ID: ");
                        String paymentID2 = scan.nextLine();
                        System.out.println("Enter units: ");
                        int units = scan.nextInt();
                        System.out.println("Enter discount rate (in percentage, e.g. 100): ");
                        double discountRate = scan.nextDouble();
                        System.out.println(campusRegistrar.calculateTuitionFee(paymentID2, units, discountRate));
                        break;

                    case 3:
                        campusRegistrar.displayAllPayments();
                        System.out.println("Make Payment");
                        System.out.println("Select Transaction");
                        System.out.println("Enter Payment ID: ");
                        String paymentID3 = scan.nextLine();
                        System.out.println("The balance of this transaction is: " + campusRegistrar.getRemainingBalance(paymentID3));
                        System.out.println("Enter amount to pay: ");
                        double amount = scan.nextDouble();
                        System.out.println(campusRegistrar.makePayment(paymentID3, amount));
                        break;

                    case 4:
                        campusRegistrar.displayAllPayments();
                        System.out.println("Get Remaining Balance of a Payment");
                        System.out.println("Select Transaction");
                        System.out.println("Enter Payment ID: ");
                        String paymentID4 = scan.nextLine();
                        System.out.println("Remaining balance: " + campusRegistrar.getRemainingBalance(paymentID4));
                        break;

                    case 5:
                        campusRegistrar.displayAllPayments();
                        System.out.println("Assign Student to a Payment");
                        System.out.println("Select Transaction");
                        System.out.println("Enter Payment ID: ");
                        String paymentID5 = scan.nextLine();
                        campusRegistrar.displayAllStudent();
                        System.out.println("Select Student");
                        System.out.println("Enter Student ID: ");
                        String studentID2 = scan.nextLine();
                        System.out.println(campusRegistrar.setPaymentStudent(paymentID5, campusRegistrar.getStudent(studentID2)));
                        break;

                    case 6:
                        campusRegistrar.displayAllPayments();
                        System.out.println("Check Payment Status");
                        System.out.println("Select Transaction");
                        System.out.println("Enter Payment ID: ");
                        String paymentID6 = scan.nextLine();
                        System.out.println(campusRegistrar.getRemainingBalance(paymentID6));
                        break;

                    case 7:
                        break;

                    default:
                        System.out.println("Error.");
                        break;
                }

            } else if (num1 == 4){
                System.out.print("\nSection Registration:\n" +
                        "Pick a number.\n" +
                        "1. Create New Section\n" +
                        "2. Display All Sections\n" +
                        "3. Update Section\n" +
                        "4. Remove Section\n" +
                        "5. Set Program of a Section\n" +
                        "6. Display Program of a Section\n" +
                        "7. Display Number of Students Enrolled in a Section\n" +
                        "8. Add Student to a Section\n" +
                        "9. Remove Student from Section\n" +
                        "10. Back to Menu\n" +
                        "Answer: ");
                int srNum = scan.nextInt();
                scan.nextLine();
                switch (srNum) {
                    case 1:
                        System.out.println("\nCreate New Section");
                        System.out.println("Enter Section ID: ");
                        String sectionID = scan.nextLine();
                        System.out.println("Enter Section Name: ");
                        String sectionName = scan.nextLine();
                        System.out.println(humanResources.saveSection(sectionID, sectionName));
                        break;

                    case 2:
                        humanResources.displayAllSections();
                        break;

                    case 3:
                        humanResources.displayAllSections();
                        System.out.println("Update Section");
                        System.out.println("Select Section");
                        System.out.println("Enter Section ID: ");
                        String sectionID2 = scan.nextLine();
                        System.out.println("Enter Section Name: ");
                        String sectionName2 = scan.nextLine();
                        System.out.println(humanResources.updateSection(sectionID2, sectionName2));
                        break;

                    case 4:
                        humanResources.displayAllSections();
                        System.out.println("Remove Section");
                        System.out.println("Select Section");
                        System.out.println("Enter Section ID: ");
                        String sectionID3 = scan.nextLine();
                        System.out.println(humanResources.removeSection(sectionID3));
                        break;

                    case 5:
                        humanResources.displayAllSections();
                        System.out.println("Set the Program of a Section");
                        System.out.println("Select Section");
                        System.out.println("Enter Section ID: ");
                        String sectionID4 = scan.nextLine();
                        humanResources.displayAllPrograms();
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID = scan.nextLine();
                        System.out.println(humanResources.setProgramToSection(humanResources.getProgram(programID), humanResources.getSection(sectionID4)));
                        break;

                    case 6:
                        humanResources.displayAllSections();
                        System.out.println("Display the Program of a Section");
                        System.out.println("Select Section");
                        System.out.println("Enter Section ID: ");
                        String sectionID5 = scan.nextLine();
                        System.out.println(humanResources.displaySectionProgram(humanResources.getSection(sectionID5)));
                        break;

                    case 7:
                        humanResources.displayAllSections();
                        System.out.println("Display Number of Students Enrolled in a Section");
                        System.out.println("Select Section");
                        System.out.println("Enter Section ID: ");
                        String sectionID6 = scan.nextLine();
                        System.out.println(humanResources.displayNumberOfStudentsEnrolled(humanResources.getSection(sectionID6)));
                        break;

                    case 8:
                        humanResources.displayAllSections();
                        System.out.println("Add Student to a Section");
                        System.out.println("Select Section");
                        System.out.println("Enter Section ID: ");
                        String sectionID7 = scan.nextLine();
                        campusRegistrar.displayAllStudent();
                        System.out.println("Select Student");
                        System.out.println("Enter Student ID: ");
                        String studentID = scan.nextLine();
                        System.out.println(humanResources.addStudentToSection(campusRegistrar.getStudent(studentID), humanResources.getSection(sectionID7)));
                        break;

                    case 9:
                        humanResources.displayAllSections();
                        System.out.println("Remove Student from a Section");
                        System.out.println("Select Section");
                        System.out.println("Enter Section ID: ");
                        String sectionID8 = scan.nextLine();
                        campusRegistrar.displayAllStudent();
                        System.out.println("Select Student");
                        System.out.println("Enter Student ID: ");
                        String studentID2 = scan.nextLine();
                        System.out.println(humanResources.removeStudentFromSection(campusRegistrar.getStudent(studentID2), humanResources.getSection(sectionID8)));
                        break;

                    case 10:
                        break;

                    default:
                        System.out.println("Error.");
                        break;

                }

            } else if (num1 == 5){
                System.out.print("\nInstructor Registration:\n" +
                        "Pick a number.\n" +
                        "1. Create New Instructor\n" +
                        "2. Display All Instructors\n" +
                        "3. Update Instructor\n" +
                        "4. Remove Instructor\n" +
                        "5. Set Program of Instructor\n" +
                        "6. Display Program of Instructor\n" +
                        "7. Add Course to Instructor\n" +
                        "8. Remove Course from Instructor\n" +
                        "9. Display Courses of an Instructor\n" +
                        "10. Back to Menu\n" +
                        "Answer: ");
                int srNum = scan.nextInt();
                scan.nextLine();
                switch (srNum) {
                    case 1:
                        System.out.println("\nCreate New Instructor");
                        System.out.println("Enter Instructor ID: ");
                        String instructorID = scan.nextLine();
                        System.out.println("Enter Instructor Name: ");
                        String instructorName = scan.nextLine();
                        System.out.println(humanResources.saveInstructor(instructorID, instructorName));
                        break;

                    case 2:
                        humanResources.displayAllInstructors();
                        break;

                    case 3:
                        humanResources.displayAllInstructors();
                        System.out.println("Update Instructor");
                        System.out.println("Select Instructor");
                        System.out.println("Enter Instructor ID: ");
                        String instructorID2 = scan.nextLine();
                        System.out.println("Enter Instructor Name: ");
                        String instructorName2 = scan.nextLine();
                        System.out.println(humanResources.updateInstructor(instructorID2, instructorName2));
                        break;

                    case 4:
                        humanResources.displayAllInstructors();
                        System.out.println("Remove Instructor");
                        System.out.println("Select Instructor");
                        System.out.println("Enter Instructor ID: ");
                        String instructorID3 = scan.nextLine();
                        System.out.println(humanResources.removeInstructor(instructorID3));
                        break;

                    case 5:
                        humanResources.displayAllInstructors();
                        System.out.println("Set Program of Instructor");
                        System.out.println("Select Instructor");
                        System.out.println("Enter Instructor ID: ");
                        String instructorID4 = scan.nextLine();
                        humanResources.displayAllPrograms();
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID");
                        String programID = scan.nextLine();
                        System.out.println(humanResources.setInstructorProgram(instructorID4, humanResources.getProgram(programID)));
                        break;

                    case 6:
                        humanResources.displayAllInstructors();
                        System.out.println("Display Program of Instructor");
                        System.out.println("Select Instructor");
                        System.out.println("Enter Instructor ID: ");
                        String instructorID5 = scan.nextLine();
                        System.out.println(humanResources.displayInstructorProgram(instructorID5));
                        break;

                    case 7:
                        humanResources.displayAllInstructors();
                        System.out.println("Add Course to Instructor");
                        System.out.println("Select Instructor");
                        System.out.println("Enter Instructor ID: ");
                        String instructorID6 = scan.nextLine();
                        humanResources.displayAllCourses();
                        System.out.println("Select Course");
                        System.out.println("Enter Course ID: ");
                        String courseID = scan.nextLine();
                        System.out.println(humanResources.addCourseToInstructor(humanResources.getCourse(courseID), instructorID6));
                        break;

                    case 8:
                        humanResources.displayAllInstructors();
                        System.out.println("Remove Course from Instructor");
                        System.out.println("Select Instructor");
                        System.out.println("Enter Instructor ID: ");
                        String instructorID7 = scan.nextLine();
                        humanResources.displayAllCourses();
                        System.out.println("Select Course");
                        System.out.println("Enter Course ID: ");
                        String courseID2 = scan.nextLine();
                        System.out.println(humanResources.removeCourseFromInstructor(humanResources.getCourse(courseID2), instructorID7));
                        break;

                    case 9:
                        humanResources.displayAllInstructors();
                        System.out.println("Display Courses of an Instructor");
                        System.out.println("Select Instructor");
                        System.out.println("Enter Instructor ID: ");
                        String instructorID8 = scan.nextLine();
                        System.out.println(humanResources.displayInstructorCourses(humanResources.getInstructor(instructorID8)));
                        break;

                    case 10:
                        break;

                    default:
                        System.out.println("Error.");
                        break;

                }

            } else if (num1 == 6){
                System.out.print("\nProgram Registration:\n" +
                        "Pick a number.\n" +
                        "1. Create New Program\n" +
                        "2. Display All Programs\n" +
                        "3. Update Program\n" +
                        "4. Remove Program\n" +
                        "5. Set Department of Program\n" +
                        "6. Display Department of Program\n" +
                        "7. Add Course to Program\n" +
                        "8. Remove Course from Program\n" +
                        "9. Add Section to Program\n" +
                        "10. Remove Section from Program\n" +
                        "11. Back to Menu\n" +
                        "Answer: ");
                int srNum = scan.nextInt();
                scan.nextLine();
                switch (srNum) {
                    case 1:
                        System.out.println("\nCreate New Program");
                        System.out.println("Enter Program ID: ");
                        String programID = scan.nextLine();
                        System.out.println("Enter Program Name: ");
                        String programName = scan.nextLine();
                        System.out.println(humanResources.saveProgram(programID, programName));
                        break;

                    case 2:
                        humanResources.displayAllPrograms();
                        break;

                    case 3:
                        humanResources.displayAllPrograms();
                        System.out.println("Update Program");
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID2 = scan.nextLine();
                        System.out.println("Enter Program Name: ");
                        String programName2 = scan.nextLine();
                        System.out.println(humanResources.updateProgram(programID2, programName2));
                        break;

                    case 4:
                        humanResources.displayAllPrograms();
                        System.out.println("Remove Program");
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID3 = scan.nextLine();
                        System.out.println(humanResources.removeProgram(programID3));
                        break;

                    case 5:
                        humanResources.displayAllPrograms();
                        System.out.println("Set Department of Program");
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID4 = scan.nextLine();
                        humanResources.displayAllDepartments();
                        System.out.println("Enter Department ID: ");
                        String deptID = scan.nextLine();
                        System.out.println(humanResources.setProgramDepartment(humanResources.getDepartment(deptID), humanResources.getProgram(programID4)));
                        break;

                    case 6:
                        humanResources.displayAllPrograms();
                        System.out.println("Display Department of Program");
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID5 = scan.nextLine();
                        System.out.println(humanResources.displayProgramDepartment(humanResources.getProgram(programID5)));
                        break;

                    case 7:
                        humanResources.displayAllPrograms();
                        System.out.println("Add Course to Program");
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID6 = scan.nextLine();
                        humanResources.displayAllCourses();
                        System.out.println("Select Course");
                        System.out.println("Enter Course ID: ");
                        String courseID = scan.nextLine();
                        System.out.println(humanResources.addCourseToProgram(humanResources.getProgram(programID6), humanResources.getCourse(courseID)));
                        break;

                    case 8:
                        humanResources.displayAllPrograms();
                        System.out.println("Remove Course from Program");
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID7 = scan.nextLine();
                        humanResources.displayAllCourses();
                        System.out.println("Select Course");
                        System.out.println("Enter Course ID: ");
                        String courseID2 = scan.nextLine();
                        System.out.println(humanResources.removeCourseFromProgram(humanResources.getProgram(programID7), humanResources.getCourse(courseID2)));
                        break;

                    case 9:
                        humanResources.displayAllPrograms();
                        System.out.println("Add Section to Program");
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID8 = scan.nextLine();
                        humanResources.displayAllSections();
                        System.out.println("Select Section");
                        System.out.println("Enter Section ID: ");
                        String sectionID = scan.nextLine();
                        System.out.println(humanResources.addSectionToProgram(humanResources.getProgram(programID8), humanResources.getSection(sectionID)));
                        break;

                    case 10:
                        humanResources.displayAllPrograms();
                        System.out.println("Remove Section from Program");
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID9 = scan.nextLine();
                        humanResources.displayAllSections();
                        System.out.println("Select Section");
                        System.out.println("Enter Section ID: ");
                        String sectionID2 = scan.nextLine();
                        System.out.println(humanResources.removeSectionFromProgram(humanResources.getProgram(programID9), humanResources.getSection(sectionID2)));
                        break;

                    case 11:
                        break;

                    default:
                        System.out.println("Error.");
                        break;

                }

            } else if (num1 == 7){
                System.out.print("\nDepartment Registration:\n" +
                        "Pick a number.\n" +
                        "1. Create New Department\n" +
                        "2. Display All Departments\n" +
                        "3. Update Department\n" +
                        "4. Remove Department\n" +
                        "5. Add Program to Department\n" +
                        "6. Remove Program from Department\n" +
                        "7. Display All Programs of a Department\n" +
                        "8. Add Instructor to Department\n" +
                        "9. Remove Instructor from Department\n" +
                        "10. Display All Instructors of a Department\n" +
                        "11. Back to Menu\n" +
                        "Answer: ");
                int srNum = scan.nextInt();
                scan.nextLine();
                switch (srNum) {
                    case 1:
                        System.out.println("Create New Deparmtent");
                        System.out.println("Enter Department ID: ");
                        String departmentID = scan.nextLine();
                        System.out.println("Enter Department Name: ");
                        String departmentName = scan.nextLine();
                        System.out.println(humanResources.saveDepartment(departmentID, departmentName));
                        break;

                    case 2:
                        humanResources.displayAllDepartments();
                        break;

                    case 3:
                        humanResources.displayAllDepartments();
                        System.out.println("Update Department");
                        System.out.println("Select Department");
                        System.out.println("Enter Department ID: ");
                        String departmentID2 = scan.nextLine();
                        System.out.println("Enter Department Name: ");
                        String departmentName2 = scan.nextLine();
                        System.out.println(humanResources.updateDepartment(departmentID2, departmentName2));
                        break;

                    case 4:
                        humanResources.displayAllDepartments();
                        System.out.println("Remove Department");
                        System.out.println("Select Department");
                        System.out.println("Enter Department ID: ");
                        String departmentID3 = scan.nextLine();
                        System.out.println(humanResources.removeDepartment(departmentID3));
                        break;

                    case 5:
                        humanResources.displayAllDepartments();
                        System.out.println("Add Program to Department");
                        System.out.println("Select Department");
                        System.out.println("Enter Department ID: ");
                        String departmentID4 = scan.nextLine();
                        humanResources.displayAllPrograms();
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID = scan.nextLine();
                        System.out.println(humanResources.addProgramToDepartment(humanResources.getDepartment(departmentID4), humanResources.getProgram(programID)));
                        break;

                    case 6:
                        humanResources.displayAllDepartments();
                        System.out.println("Remove Program from Department");
                        System.out.println("Select Department");
                        System.out.println("Enter Department ID: ");
                        String departmentID5 = scan.nextLine();
                        humanResources.displayAllPrograms();
                        System.out.println("Select Program");
                        System.out.println("Enter Program ID: ");
                        String programID2 = scan.nextLine();
                        System.out.println(humanResources.removeProgramFromDepartment(humanResources.getDepartment(departmentID5), humanResources.getProgram(programID2)));
                        break;

                    case 7:
                        humanResources.displayAllDepartments();
                        System.out.println("Display All Programs of a Department");
                        System.out.println("Select Department");
                        System.out.println("Enter Department ID: ");
                        String departmentID6 = scan.nextLine();
                        humanResources.displayAllDepartmentPrograms(humanResources.getDepartment(departmentID6));
                        break;

                    case 8:
                        humanResources.displayAllDepartments();
                        System.out.println("Add Instructor to Department");
                        System.out.println("Select Department");
                        System.out.println("Enter Department ID: ");
                        String departmentID7 = scan.nextLine();
                        humanResources.displayAllInstructors();
                        System.out.println("Select Instructor");
                        System.out.println("Enter Instructor ID: ");
                        String instructorID = scan.nextLine();
                        System.out.println(humanResources.addInstructorToDepartment(humanResources.getDepartment(departmentID7), humanResources.getInstructor(instructorID)));
                        break;

                    case 9:
                        humanResources.displayAllDepartments();
                        System.out.println("Remove Instructor from Department");
                        System.out.println("Select Department");
                        System.out.println("Enter Department ID: ");
                        String departmentID8 = scan.nextLine();
                        humanResources.displayAllInstructors();
                        System.out.println("Select Instructor");
                        System.out.println("Enter Instructor ID: ");
                        String instructorID2 = scan.nextLine();
                        System.out.println(humanResources.removeInstructorFromDepartment(humanResources.getDepartment(departmentID8), humanResources.getInstructor(instructorID2)));
                       break;

                    case 10:
                        humanResources.displayAllDepartments();
                        System.out.println("Display All Instructors of a Department");
                        System.out.println("Select Department");
                        System.out.println("Enter Department ID: ");
                        String departmentID9 = scan.nextLine();
                        humanResources.displayAllDepartmentInstructors(humanResources.getDepartment(departmentID9));
                        break;

                    case 11:
                        break;

                    default:
                        System.out.println("Error.");
                        break;

                }

            } else if (num1 == 8){
                System.exit(0);

            } else {
                System.out.println("Error.\n");
            }
        }

    }
}
