package com.stream.api.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class ToUnmodifiableList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numbersGreaterThanFour = numbers.stream()
                .filter(number -> number > 4)
                .collect(Collectors.toUnmodifiableList());

        // numbersGreaterThanFour.add(15); throws UnsupportedOperationException

        numbersGreaterThanFour.forEach(System.out::println);
    }
}
