package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * sorted() metodu, stream’deki öğeleri doğal sıralama düzenine göre (Comparable arayüzüne göre) sıralar ve sıralı yeni bir stream döner.
 */
public class Sorted {
    public static void main(String[] args) {
        System.out.println("sorted()");
        List<Integer> numbers = Arrays.asList(5, 1, 8, 3);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("sorted(Comparator<? super T> comparator)");
        List<ProductEntity> products = Arrays.asList(
                new ProductEntity("Kalem", 3.5),
                new ProductEntity("Silgi", 1.2),
                new ProductEntity("Defter", 7.8)
        );

        products.stream()
                .sorted(Comparator.comparingDouble(ProductEntity::getPrice))
                .forEach(p -> System.out.println(p.getName() + ": " + p.getPrice()));

    }
}
class ProductEntity {
    String name;
    double price;
    ProductEntity(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() { return price; }
    public String getName() { return name; }
}
