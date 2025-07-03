package com.stream.api;

import java.util.stream.Stream;

/**
 * Stream.of(...), belirtilen elemanlardan bir Stream oluşturur.
 */
public class Of {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Ali", "Ayşe", "Mehmet");

        names.forEach(System.out::println);

        Stream<String> singleName = Stream.of("Zeynep");

        singleName.map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
