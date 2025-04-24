package com.example.javabasic.final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //data instance is final
        //data = new Data(); //🔴final value can not be altered after initializatoin

        data.value = 10;
        data.value = 20; //🟢even when instance final, reference value can be altered
        //value is not final
    }
}
