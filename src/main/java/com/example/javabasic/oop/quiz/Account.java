package com.example.javabasic.oop.quiz;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if(amount > balance){
            System.out.println("no money");
            System.out.println("balance is : " + balance);
        }else{
            balance -= amount;
        }
    }
}
