package com.stream.api;

import java.util.List;
import java.util.Optional;

/**
 * findFirst(), Stream’deki ilk elemanı döner.
 * Sonuç bir Optional<T> olarak gelir çünkü stream boş olabilir.
 */
public class FindFirst {
    public static void main(String[] args) {
        List<String> names = List.of("Ali", "Ayşe", "Ahmet", "Zeynep");

        Optional<String> firstName = names.stream()
                .filter(name -> name.startsWith("A"))
                .findFirst();

        firstName.ifPresent(name -> System.out.println("First Name : " + name));

        System.out.println("******************");

        String randomName = names.stream()
                .filter(name -> name.startsWith("Ah"))
                .findFirst()
                .orElse("Not Found");

        System.out.println("Random Name : " + randomName);
    }
}
