package org.example.service;

import org.example.model.Payment;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class TuitionServiceImpl implements TuitionService{
    private List<Payment> payments = new ArrayList<>();

    public boolean savePayment(String paymentID, Student student){
        if(student == null){
            return false;
        }
        payments.add(new Payment(paymentID, student));
        return true;
    }

    public String calculateTuitionFee(String paymentID, int units, double discountRate){
        for(int i = 0; i < payments.size(); i++){
            if (payments.get(i).getPaymentID().equals(paymentID)){
                double balance = (units*payments.get(i).getPRICE_PER_UNIT())*(discountRate/100);
                payments.get(i).setBalance(balance);
                payments.get(i).setUnits(units);
                return "Tuition Fee: " + balance;
            }
        }
        return "Calculation Error. Please double check paymentID, units, or discount rate.";
    }

    public String makePayment(String paymentID, double amount){
        if(amount<=0){
            return "Please input a payment greater than 0.";
        }

        for(int i = 0; i < payments.size(); i++){
            if (payments.get(i).getPaymentID().equals(paymentID)){
                if(amount>payments.get(i).getBalance()){
                    amount -= payments.get(i).getBalance();
                    payments.get(i).setBalance(0);
                    return "Payment successful. Your change is: " + amount;
                }

                double balance = payments.get(i).getBalance() - amount;
                payments.get(i).setBalance(balance);
                return "Payment successful. Balance is now: " + balance;
            }
        }

        return "Payment successful.";
    }

    public String getRemainingBalance(String paymentID){
        for(int i = 0; i < payments.size(); i++){
            if (payments.get(i).getPaymentID().equals(paymentID)){
                double balance = payments.get(i).getBalance();
                return "Your balance is: " + balance;
            }
        }

        return "Incorrect paymentID. Please try again.";
    }

    public boolean isFullyPaid(String paymentID){
        boolean isPaid = false;
        for(int i = 0; i < payments.size(); i++){
            if (payments.get(i).getPaymentID().equals(paymentID)){
                isPaid = payments.get(i).isPaid();
            }
        }

        return isPaid;
    }

    public String setPaymentStudent(String paymentID,Student student){
        if(student == null){
            return "Failed setting student to payment.";
        }
        for(int i = 0; i < payments.size(); i++){
            if (payments.get(i).getPaymentID().equals(paymentID)){
                payments.get(i).setStudent(student);
                return "Success";
            }
        }
        return "Failed setting student to payment.";
    }

    public boolean displayAllPayments(){
        System.out.println(payments);
        System.out.println();
        return true;
    }

}
