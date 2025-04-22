package com.example.javabasic.accessmodifier.b;

import com.example.javabasic.accessmodifier.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        //DefaultClass1 defaultClass1 //🔴 cannot access default outside package
    }
}
