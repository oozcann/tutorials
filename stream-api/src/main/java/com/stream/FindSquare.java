package com.stream;

import java.util.Arrays;
import java.util.List;

public class FindSquare {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .limit(3)
                .map(number -> number*number)
                .toList()
                .forEach(System.out::println);


    }
}
