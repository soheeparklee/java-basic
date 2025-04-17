package com.example.javabasic.type.quiz;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = createOrder("cheese", 1000, 4);
        ProductOrder productOrder2 = createOrder("milk", 2000, 3);
        ProductOrder productOrder3 = createOrder("butter", 4000, 3);

        ProductOrder[] orders = {productOrder1, productOrder2, productOrder3};
        printOrders(orders);

        caculate(orders);
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

    static void caculate(ProductOrder[] orders){
        int sum=0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        System.out.println("sum: " + sum);
    }
}
