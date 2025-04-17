package com.example.javabasic.oop;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();
        increase(data);
        increase(data);
        increase(data);

    }

    static void increase(ValueData data){
        data.value++;
        System.out.println("add value: " + data.value);
    }
}
