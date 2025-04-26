package com.example.javabasic.polymorphism2.quiz2;

public class PayService {
    public Pay pay;

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public void processPay(String option, int amount ){
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        Pay pay = PayStore.findPay(option);

        if(pay.pay(amount)){
            System.out.println("결제가 성공했습니다.");
        }else{
            System.out.println("결제가 실패했습니다.");
        }
    }
}
