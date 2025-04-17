package com.example.javabasic.class1;

public class studentMain5 {
    public static void main(String[] args) {
        Student student1 = new Student(); //create student
        student1.name = "student1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //create student
        student2.name = "student2";
        student2.age = 20;
        student2.grade = 100;

        Student[] students = {student1, student2};


        for(int i=0; i<students.length; i++){
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

        for(Student s: students){
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
