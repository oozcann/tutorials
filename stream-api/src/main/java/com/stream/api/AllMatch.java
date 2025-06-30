package com.stream.api;

import java.util.List;

/**
 * allMatch(Predicate<? super T> predicate) metodu, her öğenin verilen predicate fonksiyonuna uyması durumunda true döner.
 * Eğer herhangi bir öğe bu koşula uymuyorsa, false döner.
 */

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        // Check if all numbers in list are positive
        boolean isAllPositive = integers.stream()
                .allMatch(number -> number > 0);

        System.out.println("Is all numbers positive? --> " + isAllPositive);

        // Check if all numbers in list are negative
        List<Integer> integersInvolvingNegatives = List.of(-1, -2, -3, 4, 5);
        boolean isAllNegative = integersInvolvingNegatives.stream()
                .allMatch(number -> number < 0);

        System.out.println("Is all numbers negative? --> " + isAllNegative);


    }
}
