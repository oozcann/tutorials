package com.collections.iterablecustom;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        team.addPlayer("Onur");
        team.addPlayer("Ahmet");
        team.addPlayer("Mehmet");
        team.addPlayer("Ali");

        Iterator<String> iterator = team.iterator();

        System.out.println(iterator.next());

        team.addPlayer("Taner");

        System.out.println(iterator.next());

        for (String player : team) {
            System.out.println(player);
            // team.addPlayer("Taner2"); --> Sonsuz Döngüye giriyor. O yüzden ConcurrentModificationException fırlatmalı.
        }


        /*
        // remove kullanımı
        Iterator<String> iteratorRemove = team.iterator();
        System.out.println("Remove Kullanımı");
        while (iteratorRemove.hasNext()) {
            String player = iteratorRemove.next();

            if (player.equals("Ali")) {
                iteratorRemove.remove();
            }
        }
        */

    }
}
