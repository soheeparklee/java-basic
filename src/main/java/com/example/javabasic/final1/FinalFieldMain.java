package com.example.javabasic.final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("constructor initiate");
        ConstructorInit constructorInit1 = new ConstructorInit(10); //생성 후 바꿀 수 없음
        ConstructorInit constructorInit2 = new ConstructorInit(20);
        System.out.println(constructorInit1.value);
        System.out.println(constructorInit2.value);

        System.out.println("field init");
        FieldInit fieldInit1 = new FieldInit();
        System.out.println(fieldInit1.value);

        System.out.println("static field");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
