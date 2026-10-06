package com.collections.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<String> players = new ArrayList<>();
        players.add("Ali");
        players.add("Veli");
        players.add("Ahmet");

        /*
        ArrayList<String> players2 = new ArrayList<>();
        players2.ensureCapacity(2);


        printPlayers(players);
        System.out.println("**********************");
        printPlayers(players2);

        checkIfPlayerExists(players2,"Ahmet");
        */

        // boolean add(E e);
        if (players.add("Mehmet")) {
            System.out.println("Eklendi");
        }

        /*
        // boolean add --> optional operation kategorisindedir. Her implementasyon bunu desteklemek zorunda değil.
        List<String> names = Collections.unmodifiableList(List.of("Ali", "Veli"));
        names.add("Mehmet"); // throws UnsupportedOperationException
        */

        // boolean remove(Object o) --> İlk eşleşeni kaldırır.
        if (players.remove("Veli")) {
            System.out.println("Veli silindi");
        } else {
            System.out.println("Veli listede yok.");
        }

        // boolean contains(Object o);
        System.out.println(players.contains("Ali"));  // true
        System.out.println(players.contains("Ayşe")); // false

        // int size()
        System.out.println("Toplam : " + players.size());

        System.out.println("************************");
        // retainAll --> kesişim kümesini tutar.
        Collection<String> names1 = new ArrayList<>(List.of("Ali","Veli","Mehmet"));
        Collection<String> names2 = List.of("Veli");
        names1.retainAll(names2);
        System.out.println(names1);

    }
    public static void printPlayers (Collection<String> players) {
        for (String player : players) {
            System.out.println(player);
        }
    }

    public static void checkIfPlayerExists (List<String> players, String playerName) {
        if (players.contains(playerName)) {
            System.out.println("Bulundu");
        } else {
            System.out.println("Bulunamadı");
        }
    }
}
