package com.example.javabasic.type;


public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println(bigData.data); //has address
        System.out.println(bigData.count); //0

        System.out.println(bigData.data.value); //0
    }
}
