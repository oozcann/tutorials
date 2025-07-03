package com.stream.api;

import java.util.Arrays;
import java.util.List;

/**
 * mapToLong, stream’deki her öğeyi primitive long değerine dönüştürür ve sonuç olarak bir LongStream döner.
 */
public class MapToLong {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("ORD001", 1000L),
                new Order("ORD002", 2500L),
                new Order("ORD003", 1500L)
        );

        long totalAmount = orders.stream()
                .mapToLong(Order::getAmount)
                .sum();

        System.out.println("Total Amount: " + totalAmount);
    }
}
class Order {
    String orderId;
    long amount;
    Order(String orderId, long amount) {
        this.orderId = orderId;
        this.amount = amount;
    }
    public long getAmount() { return amount; }
}