package com.stream.examples;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20, 30, 40, 50, 60);

        double average = integers.stream()
                .mapToInt(sum -> sum.intValue())
                .average()
                .getAsDouble();

        System.out.println("Average: " + average);

    }
}
