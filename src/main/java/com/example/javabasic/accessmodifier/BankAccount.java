package com.example.javabasic.accessmodifier;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //public method
    public void deposit(int amount){
        if(isAmountValid(amount)) balance += amount;
        else System.out.println("amount not valid!!!");
    }

    public void withdrawl(int amount){
        if(isAmountValid(amount) && balance - amount >0 ) balance -= amount;
        else System.out.println("amount not valid!!!");
    }

    private boolean isAmountValid(int amount){
        return amount > 0;
    }

    public int getBalance(){
        return balance;
    }
}
