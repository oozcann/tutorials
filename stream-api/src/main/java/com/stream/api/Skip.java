package com.stream.api;

import java.util.stream.Stream;

/**
 * skip(n), Stream’in ilk n elemanını atlar ve kalan elemanlarla devam eder.
 * Yani, akışın başından n adet eleman atılır, geri kalan döner.
 */
public class Skip {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7);

        numbers.skip(2)
                .limit(3)
                .forEach(System.out::println);
    }
}
