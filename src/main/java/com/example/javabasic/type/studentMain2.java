package com.example.javabasic.type;
public class studentMain2 {
    public static void main(String[] args) {
        Student student1 = createStudent("student1", 10, 90);
        Student student2 = createStudent("student2", 20, 100);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
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
