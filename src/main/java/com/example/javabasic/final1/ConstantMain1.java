package com.example.javabasic.final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println(Constant.MAX_USERS);
        int currentUser = 999;

        moreUser(currentUser);
        moreUser(currentUser);
        moreUser(currentUser);
        moreUser(currentUser);


    }

    private static void moreUser(int currentUser){
        if(currentUser > Constant.MAX_USERS) {
            System.out.println("no more! full");
        }else {
            currentUser++;
            System.out.println(currentUser);
        }
    }
}
