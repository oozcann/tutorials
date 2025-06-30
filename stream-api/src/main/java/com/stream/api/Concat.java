package com.stream.api;

import java.util.stream.Stream;

/**
 * Stream.concat(a, b) iki farklı Stream’i uç uca ekleyerek tek bir birleşik Stream oluşturur.
 */
public class Concat {
    public static void main(String[] args) {
        Stream<String> maleNames = Stream.of("Ali", "Veli", "Ahmet");
        Stream<String> femaleNames = Stream.of("Ayşe", "Zeynep", "Elif");

        Stream<String> allNames = Stream.concat(maleNames, femaleNames);

        allNames.forEach(System.out::println);
    }
}
