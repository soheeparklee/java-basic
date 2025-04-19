package com.example.javabasic.constructor;

public class MemberInit2 {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade){
        this.name = name; //this.name: class field //name: paramter
        this.age = age;
        this.grade = grade;
    }

}
