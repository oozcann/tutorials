package com.stream.api;

import java.util.List;

/**
 * filter, Stream içerisindeki elemanları verilen şarta (predicate) göre süzer.
 * Şartı sağlayan elemanlar stream’de kalır, sağlamayanlar elenir.
 */
public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
