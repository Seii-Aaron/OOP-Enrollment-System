package org.example.service;

import org.example.model.Payment;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class TuitionServiceImpl implements TuitionService{
    private List<Payment> payments = new ArrayList<>();

    public void savePayment(String paymentID, Student student, double balance, int units, boolean isPaid){
        payments.add(new Payment(paymentID, student, balance, units, isPaid));
    }

    public String calculateTuitionFee(String paymentID, int units, double discountRate){
        for(int i = 0; i < payments.size(); i++){
            if (payments.get(i).getPaymentID().equals(paymentID)){
                double balance = units*payments.get(i).getPRICE_PER_UNIT()*(discountRate/100);
                payments.get(i).setBalance(balance);
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
}
