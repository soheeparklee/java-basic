package com.example.javabasic.type;
public class studentMain1 {
    public static void main(String[] args) {
        Student student1 = new Student(); //create student
        initStudent(student1, "student1", 15, 90);

        Student student2 = new Student(); //create student
        initStudent(student2, "student1", 20, 100);

        printStudent(student1);
        printStudent(student2);

    }

    static void initStudent(Student s, String name, int age, int grade){
        s.name = name;
        s.age = age;
        s.grade = grade;
    }

    static void printStudent(Student s){
        System.out.println("이름:" + s.name + " 나이:" + s.age + " grade: " + s.grade);
    }
}
