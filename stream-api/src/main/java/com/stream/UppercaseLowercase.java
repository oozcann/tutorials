package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseLowercase {
    public static void main(String[] args) {
        List<String> lowerCaseStrings = Arrays.asList("ali", "veli", "ayse", "fatma");
        List<String> upperCaseStrings = Arrays.asList("ALİ", "VELİ", "AYSE", "FATMA");


        List<String> fromLowerToUpper = lowerCaseStrings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("***From Lower To Upper***");
        fromLowerToUpper.forEach(System.out::println);

        List<String> fromUpperToLower = upperCaseStrings.stream()
                .map(String::toLowerCase)
                .toList();

        System.out.println("***From Upper To Lower***");
        fromUpperToLower.forEach(System.out::println);

    }
}
