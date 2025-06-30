package com.stream.api.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToArray {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Object[] numbersGreaterThanFour = numbers.stream()
                .filter(number -> number > 4)
                .toArray();

        for (Object integer : numbersGreaterThanFour) {
            System.out.println(integer);
        }
    }
}
