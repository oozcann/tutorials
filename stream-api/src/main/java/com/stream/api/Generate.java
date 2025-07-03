package com.stream.api;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Stream.generate(Supplier<T> s), verdiğin Supplier fonksiyonu ile sonsuz bir stream oluşturur.
 * Her çağrıda Supplier'dan yeni bir değer üretir.
 */
public class Generate {
    public static void main(String[] args) {
        Stream.generate(() -> new Random().nextInt(100))
                .limit(5)
                .forEach(System.out::println);
    }
}
