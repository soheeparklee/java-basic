package com.example.javabasic.class1;

public class studentMain4 {
    public static void main(String[] args) {
        Student student1 = new Student(); //create student
        student1.name = "student1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //create student
        student2.name = "student2";
        student2.age = 20;
        student2.grade = 100;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;



        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);

    }
}
