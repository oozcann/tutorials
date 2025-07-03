package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * min, stream’deki öğeler arasında belirtilen Comparator'a göre en küçük öğeyi bulur.
 * Döndürdüğü sonuç Optional<T> şeklindedir (çünkü stream boş olabilir).
 */
public class Min {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(45, 12, 78, 3, 19);

        numbers.stream()
                .min(Comparator.naturalOrder())
                .ifPresent(min -> System.out.println("Min Number: " + min));
    }
}
