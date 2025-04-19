package com.example.javabasic.constructor;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){ //constuctor name == class name
        System.out.println("name: "+ name + " age: "+ age+ " grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
