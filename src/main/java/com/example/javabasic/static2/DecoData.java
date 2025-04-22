package com.example.javabasic.static2;

public class DecoData {
    private int instanceValue; //instance variable
    private static int staticValue; //static

    public static void staticCall(){
        staticValue++;
        //instanceValue++; //🔴compile error, static can only use static
        //instanceMethod(); //🔴static can only use static
    }

    public void instanceMethod(){
        staticValue++; //🟢instance can use both static and not static
        instanceValue++;
        staticCall();
    }
}
