package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * flatMapToInt, her öğeyi bir IntStream'e dönüştürür ve bu alt akışları düzleştirerek (flatten) tek bir IntStream haline getirir.
 */
public class FlatMapToInt {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1,2", "3", "4,5,6");

        IntStream intStream = list.stream()
                .flatMapToInt(s -> {
                    return Arrays.stream(s.split(","))
                            .mapToInt(Integer::parseInt);
                });

        intStream.forEach(System.out::println);
    }
}
