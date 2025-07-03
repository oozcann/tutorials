package com.stream.api;

import java.util.Arrays;
import java.util.List;

/**
 * noneMatch, stream’deki hiçbir eleman verilen koşulu sağlamıyorsa true döner.
 */
public class NoneMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 20);

        boolean noneNegative = numbers.stream()
                .noneMatch(n -> n < 0);

        System.out.println("No negative number? : " + noneNegative);
    }
}
