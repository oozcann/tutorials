package com.stream.api;

import java.util.Arrays;
import java.util.List;

/**
 * mapToLong, stream’deki her öğeyi primitive long değerine dönüştürür ve sonuç olarak bir LongStream döner.
 * mapToLong dönüşümünden sonra gelen LongStream şu metodları destekler: sum(), average(), min(), max(), summaryStatistics(), vs.
 */
public class MapToLong {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("ORD001", 1000L),
                new Order("ORD002", 2500L),
                new Order("ORD003", 1500L)
        );

        long max = orders.stream()
                .mapToLong(Order::getAmount)
                .summaryStatistics()
                .getMax();

        System.out.println("Total Amount: " + max);
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