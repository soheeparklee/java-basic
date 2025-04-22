package com.example.javabasic.static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello";

        String result = DecoUtil2.deco(s); //call static method without creating instance
        System.out.println(result);
    }
}
