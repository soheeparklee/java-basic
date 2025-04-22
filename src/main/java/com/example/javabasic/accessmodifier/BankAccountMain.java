package com.example.javabasic.accessmodifier;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdrawl(13000);
        System.out.println(account.getBalance());

    }
}
