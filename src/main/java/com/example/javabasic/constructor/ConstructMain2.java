package com.example.javabasic.constructor;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("member1", 15, 90);
        //use constructor, 그러면
        //한번에 create class and field 가능

        //MemberConstruct member2 = new MemberConstruct(); //not possible
        //member2.name = "member2"; //not possible

        MemberConstruct member2 = new MemberConstruct("member2", 16);

        System.out.println(member1.name + " " + member1.age + " " + member1.grade);
        System.out.println(member2.name + " " + member2.age + " " + member2.grade);

    }

}
