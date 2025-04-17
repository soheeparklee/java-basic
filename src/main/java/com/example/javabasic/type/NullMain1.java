package com.example.javabasic.type;


public class NullMain1 {
    public static void main(String[] args) {
        Data data1 = null;
        System.out.println(data1); //no address, null

        Data data2 = new Data();
        System.out.println(data2); //has address
        System.out.println(data2.value); //0

        data2= null;
        System.out.println(data2); //no address, null
    }


}
