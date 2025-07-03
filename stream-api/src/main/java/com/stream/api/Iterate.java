package com.stream.api;

import java.util.stream.Stream;

/**
 *Stream.iterate(seed, f) → başlangıç değeri (seed) ile başlar ve her adımda verilen fonksiyonu (UnaryOperator) uygulayarak sonsuz bir stream oluşturur.
 */
public class Iterate {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("*********************************");

        Stream.iterate("A", s -> s + "A")
                .limit(4)
                .forEach(System.out::println);
    }
}
