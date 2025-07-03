package com.stream.api;

import java.util.Arrays;
import java.util.List;

/**
 *mapToDouble, her bir öğeyi primitive double değerine dönüştürür ve sonuç olarak DoubleStream döner.
 * Yani Stream<T> → DoubleStream dönüşümü yapar.
 */
public class MapToDouble {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Kitap", 25.5),
                new Product("Kalem", 5.0),
                new Product("Defter", 12.75)
        );

        double totalPrice = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("Toplam fiyat: " + totalPrice);
    }
}

class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() { return price; }
}
