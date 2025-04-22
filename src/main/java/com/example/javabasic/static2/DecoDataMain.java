package com.example.javabasic.static2;

public class DecoDataMain {
    public static void main(String[] args) {
        DecoData.staticCall(); //static method

        DecoData data = new DecoData();
        data.instanceMethod(); //instance method
    }
}
