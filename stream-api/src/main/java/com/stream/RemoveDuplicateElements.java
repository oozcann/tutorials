package com.stream;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Veli", "Ali", "Mehmet");

        List<String> strings = names.stream()
                .distinct()
                .toList();

        System.out.println(strings);


    }
}
