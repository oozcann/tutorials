package com.stream.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Mango", "Apple", "Blueberry", "Avocado", "Watermelon", "Banana");
        List<String> sortedAscendingFruits = fruits.stream()
                .sorted()
                .toList();
        System.out.println("***Ascending Order***");
        sortedAscendingFruits.forEach(System.out::println);

        List<String> sortedDescendingFruits = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("***Descending Order***");
        sortedDescendingFruits.forEach(System.out::println);
    }
}
