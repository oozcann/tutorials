package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 * flatMapToDouble, her öğeyi DoubleStream'e çevirir ve sonuçta tek bir DoubleStream elde eder.
 * Yani Stream<T> içindeki her öğe için bir DoubleStream üretir ve bu alt akışları düzleştirerek tek bir DoubleStream haline getirir.
 */
public class FlatMapToDouble {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1.2,3.4", "5.6", "7.8,9.0");

        DoubleStream doubleStream = list.stream()
                .flatMapToDouble(s -> {
                    String[] parts = s.split(",");
                    return Arrays.stream(parts)
                            .mapToDouble(Double::parseDouble);
                });

        doubleStream.forEach(System.out::println);
    }
}
