package com.stream.api;

import java.util.stream.Stream;

/**
 * limit(maxSize) Stream’deki eleman sayısını maksimum maxSize kadar sınırlar.
 * Yani, stream’in başından başlayarak en fazla maxSize eleman alır, kalanını atar.
 */
public class Limit {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7);

        numbers.limit(3)
                .forEach(System.out::println);
    }
}
