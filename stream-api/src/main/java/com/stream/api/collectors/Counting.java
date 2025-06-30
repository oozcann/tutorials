package com.stream.api.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        int count = integers.stream()
                .collect(Collectors.counting())
                .intValue();

        System.out.println("Count : " + count);
    }
}
