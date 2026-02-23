package org.example;

import org.example.model.*;
import org.example.service.CourseRegistration;
import org.example.service.StudentRegistration;

import java.util.Scanner;

public class Main{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        StudentRegistration studentRegistration = new StudentRegistration();
        CourseRegistration courseRegistration = new CourseRegistration();

        //interactive
        while (true){
            System.out.print("\nPick a number.\n" +
                    "1. Student Registration\n" +
                    "2. Course Registration\n" +
                    "3. Exit\n" +
                    "Answer: ");

            int num1 = scan.nextInt();

            if (num1 == 1){
                System.out.print("\nStudent Registration:\n" +
                        "Pick a number.\n" +
                        "1. Save Student\n" +
                        "2. Display Student\n" +
                        "3. Update Student\n" +
                        "4. Remove Student\n" +
                        "Answer: ");
                int srNum = scan.nextInt();
                scan.nextLine();
                switch(srNum){
                    case 1:
                        System.out.println("\nSave Student.");
                        System.out.println("Enter Student ID: ");
                        String studID = scan.nextLine();

                        System.out.println("Enter Student Name: ");
                        String studName = scan.nextLine();

                        System.out.println("Enter Program: ");
                        String studProgram = scan.nextLine();

                        studentRegistration.saveStudent(new Student(studID, studName, studProgram));
                        break;

                    case 2:
                        studentRegistration.displayAllStudent();
                        break;

                    case 3:
                        studentRegistration.displayAllStudent();
                        System.out.println("Update Student.");
                        System.out.println("Enter Student ID: ");
                        String newStudID = scan.nextLine();
                        studentRegistration.updateStudent(new Student(newStudID));
                        break;

                    case 4:
                        studentRegistration.displayAllStudent();
                        System.out.println("Remove Student.");
                        System.out.println("Enter Student ID: ");
                        String delStudID = scan.nextLine();
                        System.out.println(studentRegistration.removeStudent(new Student(delStudID)));
                        break;

                    default:
                        System.out.println("Error.");
                        break;
                }



            } else if (num1 == 2){
                System.out.print("\nCourse Registration:\n" +
                        "Pick a number.\n" +
                        "1. Save Course\n" +
                        "2. Display Course\n" +
                        "3. Update Course\n" +
                        "4. Remove Course\n" +
                        "Answer: ");
                int crNum = scan.nextInt();
                scan.nextLine();
                switch(crNum){
                    case 1:
                        System.out.println("\nSave Course.");
                        System.out.println("Enter Course ID: ");
                        String courseID = scan.nextLine();

                        System.out.println("Enter Course Name: ");
                        String courseName = scan.nextLine();

                        System.out.println("Enter Program: ");
                        String courseProgram = scan.nextLine();

                        courseRegistration.save(new Course(courseID, courseName, courseProgram));
                        break;

                    case 2:
                        courseRegistration.displayAll();
                        break;

                    case 3:
                        courseRegistration.displayAll();
                        System.out.println("Update Course.");
                        System.out.println("Enter Course ID: ");
                        String newCourseID = scan.nextLine();
                        courseRegistration.updateCourse(new Course(newCourseID));
                        break;

                    case 4:
                        courseRegistration.displayAll();
                        System.out.println("Remove Course.");
                        System.out.println("Enter Course ID: ");
                        String delCourseID = scan.nextLine();
                        System.out.println(courseRegistration.removeCourse(new Course(delCourseID)));
                        break;

                    default:
                        System.out.println("Error.");
                        break;
                }


            } else if (num1 == 3){
                System.exit(0);


            } else {
                System.out.println("Error.\n");
            }
        }

    }
}
