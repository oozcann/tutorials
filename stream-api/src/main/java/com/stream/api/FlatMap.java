package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * flatMap, her bir öğeyi Stream'e dönüştürüp, sonra bu alt Stream'leri düzleştirerek (flatten) tek bir Stream haline getirir.
 */
public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e")
        );

        List<String> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(flattenedList);
    }
}
