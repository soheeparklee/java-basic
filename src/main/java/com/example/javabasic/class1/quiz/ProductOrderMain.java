package com.example.javabasic.class1.quiz;

import com.example.javabasic.class1.quiz.ProductOrder;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "cheese";
        productOrder1.price = 1000;
        productOrder1.quantity = 5;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "butter";
        productOrder2.price = 2000;
        productOrder2.quantity = 3;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "milk";
        productOrder3.price = 3000;
        productOrder3.quantity = 10;

        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};
        int totalSum = 0;
        for (ProductOrder productOrder : productOrders) {
            totalSum += productOrder.price * productOrder.quantity;
            System.out.println("name: " + productOrder.productName + " | price: "+ productOrder.price + " | quantity: " + productOrder.quantity);
        }
        System.out.println("sum:" + totalSum);


    }
}
