package org.example.service;

import org.example.model.Program;
import org.example.model.Section;
import org.example.model.Student;

public class CampusRegistrar {
    private StudentRegistration studReg;
    private TuitionService tuitionService;

    public CampusRegistrar(StudentRegistration studReg, TuitionService tuitionService){
        this.studReg = studReg;
        this.tuitionService = tuitionService;
    }

    public String saveStudent(String studentID, String name){
        studReg.saveStudent(studentID, name);
        return "Success";
    }

    public String displayAllStudent(){
        studReg.displayAllStudent();
        return "Success";
    }

    public String updateStudent(String studentID, String name){
        boolean result = studReg.updateStudent(studentID, name);
        if (result){
            return "Success";
        } else {
            return "Failed to update student. Please double-check the student ID.";
        }
    }

    public String removeStudent(String studentID){
        boolean result = studReg.removeStudent(studentID);
        if (result){
            return "Success";
        } else {
            return "Failed to remove student. Please double-check the student ID.";
        }
    }

    public String setStudentProgram(String studentID, Program program){
        boolean result = studReg.setStudentProgram(studentID, program);
        if (result) {
            return "Success";
        } else {
            return "Failed to set the student's program.";
        }
    }
    public String setStudentSection(String studentID, Section section){
        boolean result = studReg.setStudentSection(studentID, section);
        if (result) {
            return "Success";
        } else {
            return "Failed to set the student's section.";
        }
    }


    public String savePayment(String paymentID, Student student, double balance, int units, boolean isPaid){
        tuitionService.savePayment(paymentID, student, balance, units, isPaid);
        return "Success";
    }

    public String calculateTuitionFee(String paymentID, int units, double discountRate){
        String calculatedFee = tuitionService.calculateTuitionFee(paymentID, units, discountRate);
        return calculatedFee;
    }

    public String makePayment(String paymentID, double amount){
        String payment = tuitionService.makePayment(paymentID, amount);
        return payment;
    }

    public String getRemainingBalance(String paymentID){
        String balance = tuitionService.getRemainingBalance(paymentID);
        return balance;
    }

    public String isFullyPaid(String paymentID){
        boolean isPaid = tuitionService.isFullyPaid(paymentID);
        if(isPaid){
            return "Balance is already paid.";
        } else {
            return "Balance is not yet fully paid.";
        }
    }
}
