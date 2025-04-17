package com.example.javabasic.type.quiz;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i=0; i<n; i++){
            System.out.print((i+1)+ "번째 주문 정보를 입력하세요.");
            scanner.nextLine();

            System.out.print("name: ");
            String name = scanner.nextLine();

            System.out.print("price: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            System.out.print("quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(name, price, quantity);
        }

        printOrders(orders);
        int sum = caculate(orders);
        System.out.println("total sum is " + sum);

    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("name: "+ order.productName + " price: "+ order.price + " quantity:  " + order.quantity);
        }
    }

    static int caculate(ProductOrder[] orders){
        int sum=0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
