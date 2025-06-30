package com.stream.api;

import java.util.List;

/**
 * allMatch(Predicate<? super T> predicate) metodu, herhangi bir öğenin verilen predicate fonksiyonuna uyması durumunda true döner.
 * Eğer herhangi bir öğe bu koşula uymuyorsa, false döner.
 */
public class AnyMatch {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Watermelon");

        boolean anyMatchWithLetterB = fruits.stream()
                .anyMatch(fruit -> fruit.startsWith("B"));
        System.out.println("Is any fruit starting with letter B? --> " + anyMatchWithLetterB);

        boolean anyMatchWithLetterC = fruits.stream()
                .anyMatch(fruit -> fruit.startsWith("C"));
        System.out.println("Is any fruit starting with letter C? --> " + anyMatchWithLetterC);

    }
}
