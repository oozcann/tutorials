package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

/**
 *flatMapToLong, her öğeyi bir LongStream'e dönüştürür ve bu alt akışları tek bir düz LongStream haline getirir.
 */
public class FlatMapToLong {
    public static void main(String[] args) {
        List<String> timestamps = Arrays.asList("1000,2000", "3000", "4000,5000");

        LongStream longStream = timestamps.stream()
                .flatMapToLong(s -> {
                    return Arrays.stream(s.split(","))
                            .mapToLong(Long::parseLong);
                });

        longStream.forEach(System.out::println);
    }
}
