package com.stream.api;

import java.util.Arrays;
import java.util.List;

/**
 * forEach, bir Stream'in her elemanı üzerinde verilen işlemi (yani Consumer'ı) çalıştırır.
 */
public class ForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Ayşe", "Mehmet");

        names.stream().forEach(name -> System.out.println("Name: " + name));
    }
}
