package com.stream;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "hello world";

        input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((key,value) -> {
                    System.out.println("Key : " + key + " Value: " + value);
                });

    }
}
