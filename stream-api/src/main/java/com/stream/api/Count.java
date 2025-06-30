package com.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        long count = integers.stream()
                .count();

        System.out.println("Count : " + count);
    }
}
