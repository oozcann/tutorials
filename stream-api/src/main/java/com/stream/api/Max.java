package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * max, stream’deki öğeler arasında belirttiğin karşılaştırmaya göre en büyük olanı bulur.
 * Döndürdüğü sonuç: Optional<T>
 */
public class Max {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 5, 42);

        numbers.stream()
                .max(Comparator.naturalOrder())
                .ifPresent(max -> System.out.println("Max Number: " + max));
    }
}
