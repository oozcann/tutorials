package com.stream.api;

import java.util.Arrays;
import java.util.List;

/**
 * forEachOrdered, stream içindeki her öğe için verilen işlemi sıralı bir şekilde uygular.
 * Özellikle **parallel stream** (çok çekirdekli çalıştırma) kullandığında ve işlemlerin sırasının bozulmamasını istiyorsan.
 * Sonuçların sıralı olması kritikse (forEach sırayı garanti etmez!).
 */
public class ForEachOrdered {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Ayşe", "Mehmet");

        names.stream()
                .forEachOrdered(name -> System.out.println("Name: " + name));
    }
}
