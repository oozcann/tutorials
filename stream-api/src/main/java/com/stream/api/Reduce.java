package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * reduce, stream’deki elemanları ikili bir işlemle (BinaryOperator) birleştirerek tek bir sonuç üretir.
 */
public class Reduce {
    public static void main(String[] args) {

        // reduce(BinaryOperator<T> accumulator)
        System.out.println("reduce(BinaryOperator<T> accumulator)");
        List<Integer> numbers = Arrays.asList(2, 4, 6);
        Optional<Integer> total = numbers.stream()
                .reduce((a, b) -> a + b);
        total.ifPresent(sum -> System.out.println("Sum: " + sum));

        List<String> fruits = Arrays.asList("apple", "pineapple", "strawberry", "banana");
        fruits.stream()
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                .ifPresent(longest -> System.out.println("Longest Word: " + longest));
        System.out.println("************************");
        System.out.println("reduce(T identity, BinaryOperator<T> accumulator)");
        // reduce(T identity, BinaryOperator<T> accumulator)
        // Bu versiyon, bir başlangıç (identity) değeriyle başlar ve accumulator fonksiyonu ile stream’deki tüm elemanlar üzerinden geçerek tek bir sonuç üretir.
        List<Integer> integers = Arrays.asList(10, 20, 30);
        int sum = integers.stream()
                .reduce(10, (a, b) -> a + b);
        System.out.println("Sum: " + sum);


        System.out.println("************************");
        System.out.println("reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)");
        // Farklı türde bir çıktı üretmek istiyorsan (örneğin Stream<String> → Integer toplam uzunluk)
        List<String> words = Arrays.asList("Java", "Stream", "API");
        int totalLength = words.stream()
                .reduce(
                        0,                                 // identity
                        (partialSum, word) -> partialSum + word.length(), // accumulator
                        Integer::sum                      // combiner
                );

        System.out.println("Total character count: " + totalLength);


    }
}
