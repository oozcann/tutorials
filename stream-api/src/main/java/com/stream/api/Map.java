package com.stream.api;

import java.util.Arrays;
import java.util.List;

/**
 * map, stream’deki her elemanı başka bir tipe dönüştürür veya üzerinde işlem yapar.
 * Yeni bir stream oluşturur. Her öğe için mapper fonksiyonu çalıştırılır.
 */
public class Map {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
