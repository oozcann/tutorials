package com.stream.api;

import java.util.List;

/**
 * distinct(), Stream’deki tekrarlı elemanları filtreler, sadece benzersiz (eşsiz) olanları bırakır.
 * Elemanların equals() ve hashCode() metodlarına göre karşılaştırma yapılır.
 */
public class Distinct {
    public static void main(String[] args) {
        List<String> names = List.of("Ali", "Ayşe", "Ali", "Zeynep", "Ayşe");

        List<String> filteredNames = names.stream()
                .distinct()
                .toList();

        filteredNames.forEach(System.out::println);
    }
}
