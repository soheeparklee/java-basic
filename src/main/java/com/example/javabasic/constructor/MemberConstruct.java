package com.example.javabasic.constructor;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberConstruct(String name, int age){
        this(name, age, 0);
    }
}
