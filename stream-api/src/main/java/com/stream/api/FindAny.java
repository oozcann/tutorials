package com.stream.api;

import java.util.List;
import java.util.Optional;

/**
 * findAny(), Stream’deki herhangi bir elemanı döner (özellikle paralel stream’lerde rastgele bir eleman olabilir).
 * Sonuç bir Optional<T> olarak döner, çünkü stream boş olabilir.
 */
public class FindAny {
    public static void main(String[] args) {
        List<String> names = List.of("Ali", "Ayşe", "Ahmet", "Zeynep");

        Optional<String> anyName = names.stream()
                .filter(name -> name.startsWith("A"))
                .findAny();

        anyName.ifPresent(name -> System.out.println("Any Name : " + name));

        System.out.println("******************");

        String randomName = names.stream()
                .filter(name -> name.startsWith("B"))
                .findAny()
                .orElse("Not Found");

        System.out.println("Random Name : " + randomName);
    }
}
