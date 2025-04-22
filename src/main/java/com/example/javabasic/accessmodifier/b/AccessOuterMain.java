package com.example.javabasic.accessmodifier.b;

import com.example.javabasic.accessmodifier.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        //data.defaultField = 2; //🔴compile error, default canot be accessed outside package
        //data.defaultMethod();

        //data.privateField = 3; //🔴compile error, private cannot be accessed outside class
        //data.privateMethod();

        data.innerAccess();
    }
}
