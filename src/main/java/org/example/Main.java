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
