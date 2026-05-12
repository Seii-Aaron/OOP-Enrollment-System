package org.example.service;

import org.example.model.Student;

public interface TuitionService {
    boolean savePayment(String paymentID, Student student);
    String calculateTuitionFee(String paymentID, int units, double discountRate);
    String makePayment(String paymentID, double amount);
    String getRemainingBalance(String paymentID);
    String setPaymentStudent(String paymentID, Student student);
    boolean isFullyPaid(String paymentID);
    boolean displayAllPayments();
}
