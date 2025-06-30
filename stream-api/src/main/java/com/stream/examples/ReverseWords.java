package com.stream.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello Java World";

        List<String> words = Arrays.asList(input.split(" "));

        // Stream.of(array[]) --> Böyle de stream oluşturulabilir.

        words.stream()
                .sorted(Comparator.reverseOrder())
                .toList()
                .forEach(word -> {
                    System.out.print(word + " ");
                });

        String s = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(s);

    }
}
