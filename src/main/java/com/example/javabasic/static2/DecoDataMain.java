package com.example.javabasic.static2;

import static com.example.javabasic.static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        staticCall(); //static method

        DecoData data = new DecoData();
        data.instanceMethod(); //instance method

        staticCall();
        staticCall();
        staticCall();
    }
}
