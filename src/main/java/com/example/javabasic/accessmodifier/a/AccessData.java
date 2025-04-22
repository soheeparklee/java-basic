package com.example.javabasic.accessmodifier.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

//    private AccessData(int publicField){
//        this.publicField = publicField;
//    };

    public void publicMethod(){
        System.out.println("call public method" + publicField);
    }

    void defaultMethod(){
        System.out.println("call default method" + defaultField);
    }

    private void privateMethod(){
        System.out.println("call private method" + privateField);
    }

    public void innerAccess(){
        System.out.println("innerAccess");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
