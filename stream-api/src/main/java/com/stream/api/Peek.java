package com.stream.api;

import java.util.Arrays;
import java.util.List;

/**
 * peek, stream işlemi sırasında ara gözlem yapmak için kullanılır.
 * Stream'deki öğeleri değiştirmez, sadece bir işlem uygular (genellikle loglama, debug, vs).
 */
public class Peek {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Ayşe", "Mehmet");

        names.stream()
                .peek(name -> System.out.println("Orijinal: " + name))
                .map(String::toUpperCase)
                .peek(name -> System.out.println("Büyük harf: " + name))
                .forEach(finalName -> System.out.println("Son çıktı: " + finalName));
    }
}
