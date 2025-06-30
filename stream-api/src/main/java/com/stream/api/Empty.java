package com.stream.api;

import java.util.stream.Stream;

/**
 * Stream.empty() sıfır elemanlı, yani boş bir Stream oluşturur.
 */
public class Empty {
    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.empty();

        long count = emptyStream.count();

        System.out.println("Count : " + count);
    }
}
