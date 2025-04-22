package com.example.javabasic.static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello";
        DecoUtil1 utils = new DecoUtil1();

        String result = utils.deco(s);
        System.out.println(result);
    }
}
