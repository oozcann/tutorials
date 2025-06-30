package com.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxMinNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int maxValue = numbers.stream()
                .mapToInt(number -> number.intValue())
                .max()
                .getAsInt();
        System.out.println("Max Value: " + maxValue);

        int minValue = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
        System.out.println("Min Value: " + minValue);


    }
}
