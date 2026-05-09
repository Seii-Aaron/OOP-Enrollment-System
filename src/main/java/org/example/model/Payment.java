package org.example.model;

public class Payment {
    private String paymentID;
    private Student student;
    private double balance;
    private int units;
    private boolean isPaid;
    private final int PRICE_PER_UNIT = 3000;

    public Payment(){

    }

    public Payment(String paymentID, Student student, double balance, int units, boolean isPaid) {
        this.paymentID = paymentID;
        this.student = student;
        this.balance = balance;
        this.isPaid = isPaid;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public int getPRICE_PER_UNIT() {
        return PRICE_PER_UNIT;
    }
}
