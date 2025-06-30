package com.stream.examples;

import java.util.stream.IntStream;

public class SumOfDigits {
    public static void main(String[] args) {

        int number = 12345;

        int sum = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println("Sum: " + sum);


    }
}
