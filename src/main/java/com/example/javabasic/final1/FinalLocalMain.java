package com.example.javabasic.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        int data0;
        data0 = 10;
        data0 = 20; //change value possible

        //final local variable
        final int data1;
        data1 = 10; //can set value once
        //data1 = 20; //🔴compile error

        final int data2 = 10;
    }

    static void method(final int parameter){
        //parameter = 20; //🔴 final parameter cannot be changed
    }
}
