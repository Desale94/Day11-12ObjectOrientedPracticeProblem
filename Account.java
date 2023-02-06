package com.bridgelabz.OOPSExample;

public class Account {

    private double balance;
    public Account(){

    }
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
        else
            System.out.println("Deposit amount is not valid.");
    }
    public void withdraw(double withdrawAmount)
    {
        if (withdrawAmount <= balance)
            balance = balance - withdrawAmount;
        else
            System.out.println("Withdrawal amount exceeded account balance.");
    }

    public double getBalance() {

        return balance;

    }

    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(1000);
        a.withdraw(5000);
        System.out.println(a.balance);
    }

}