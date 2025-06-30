package com.stream.examples;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println("***Even Numbers***");
        evenNumbers.forEach(System.out::println);


        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 == 1)
                .toList();

        System.out.println("***Odd Numbers***");
        oddNumbers.forEach(System.out::println);
    }
}
