package com.example.javabasic.polymorphism2.quiz2;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        Pay kakaoService = new KakaoPay();
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        Pay naverService = new NaverPay();
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //잘못된 결제 수단 선택
        Pay badService = new DefaultPay();
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}
