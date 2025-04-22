package com.example.javabasic.accessmodifier.quiz;

public class ShoppingCart {

    private Item[] items = new Item[2];
    private int itemCount = 0 ;

    void addItem(Item item){
        if(itemCount >= items.length) {
            System.out.println("cart is full");
            return;
        }
            items[itemCount] = item;
            itemCount++;

    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int totalSum = 0;
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() +  "합계: " + item.caculatePrice());
            totalSum += item.caculatePrice();
        }
        System.out.println("전체 가격 합: " + totalSum);
    }

//    public void displayItems() {
//        System.out.println("장바구니 상품 출력");
//        int totalSum = 0;
//        for (int i = 0; i < itemCount; i++) {
//            Item item = items[i];
//            System.out.println("상품명:" + item.getName() + ", 합계:" +
//                    item.caculatePrice());
//            totalSum += item.caculatePrice();
//        }
//        System.out.println("전체 가격 합:" + totalSum);
//    }
}
