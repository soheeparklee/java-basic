package com.example.javabasic.polymorphism2.quiz2;

public class DefaultPay implements  Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }


}
