package org.example;

import org.example.service.*;

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
                        System.out.println(humanResources.displayAllPrograms());
                        System.out.println("Enter Program ID: ");
                        String progID = scan.nextLine();
                        System.out.println(humanResources.setCourseProgram(courseID2, humanResources.getProgram(progID)));
                        break;

                    default:
                        System.out.println("Error.");
                        break;
                }


            } else if (num1 == 3){

            } else if (num1 == 4){

            } else if (num1 == 5){

            } else if (num1 == 6){

            } else if (num1 == 7){

            } else if (num1 == 8){
                System.exit(0);


            } else {
                System.out.println("Error.\n");
            }
        }

    }
}
