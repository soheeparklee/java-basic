package com.example.javabasic.type;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = 20;
        System.out.println("a is changed to 20");
        System.out.println("a: " + a); // a = 20
        System.out.println("b: " + b); // b = 10

        b = 30;
        System.out.println("b is changed to 30");
        System.out.println("a: " + a); // a = 20
        System.out.println("b: " + b); // b = 30
    }
}
