package com.bridgelabz.OOPSExample;

public class Account {


    private double balance;


    public Account ( double initialBalance )
    {

        if ( initialBalance > 0.0 )
            balance = initialBalance;
    }

    public void credit( double amount )
    {
        balance = balance + amount;
    }
    public void debit( double debitAmount )
    {


        if (debitAmount > balance)
        {
            debitAmount = 0.0;
            System.out.println( "Debit amount exceeded account balance." );
        }
        balance = balance - debitAmount;
    }
    public double getBalance()
    {
        return balance;
    }
}