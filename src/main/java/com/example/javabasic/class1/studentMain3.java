package com.example.javabasic.class1;

public class studentMain3 {
    public static void main(String[] args) {
        Student student1 = new Student(); //create student
        student1.name = "student1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //create student
        student2.name = "student2";
        student2.age = 20;
        student2.grade = 100;

        System.out.println(student1);
        System.out.println(student2);

    }
}
