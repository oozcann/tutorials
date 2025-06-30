package com.stream.api;

import java.util.stream.Stream;

/**
 * Stream.builder(), adım adım eleman ekleyerek bir Stream oluşturmayı sağlar.
 */
public class Builder {
    public static void main(String[] args) {
        Stream.builder()
                .add("Ali")
                .add("Veli")
                .add("Ayşe")
                .add("Fatma")
                .build()
                .forEach(System.out::println);
    }
}
