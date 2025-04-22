package com.example.javabasic.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("data: " + data1.count);
        System.out.println("data: " + Data3.count); //static

        Data3 data2 = new Data3("B");
        System.out.println("data: " + data2.count);
        System.out.println("data: " + Data3.count); //static


        Data3 data3 = new Data3("C");
        System.out.println("data: " + data3.count);
        System.out.println("data: " + Data3.count); //static



    }
}
