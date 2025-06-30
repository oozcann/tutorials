package com.stream.api.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class ToList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numbersGreaterThanFour = numbers.stream()
                .filter(number -> number > 4)
                .toList();

        numbersGreaterThanFour.forEach(System.out::println);

        System.out.println("*************************");

        // Another Usage
        List<Integer> numbersGreaterThanSeven = numbers.stream()
                .filter(number -> number > 7)
                .collect(Collectors.toList());

        numbersGreaterThanSeven.forEach(System.out::println);

    }
}
