package com.collections.collection;

import com.collections.model.Player;

import java.util.ArrayList;
import java.util.List;

public class EqualsTestService {

    List<Player> players = new ArrayList<>();
    Player p1 = new Player("Ali");
    Player p2 = new Player("Ali");

    private void checkEquality () {
        if (p1 == p2) {
            System.out.println("== kontrolü yapıldı. Sonuç: Eşit.");
        } else {
            System.out.println("== kontrolü yapıldı. Sonuç: Eşit Değil.");
        }
    }

    private void checkEquality2 () {
        if (p1.equals(p2)) {
            System.out.println(".equals() kontrolü yapıldı. Sonuç: Eşit.");
        } else {
            System.out.println(".equals() kontrolü yapıldı. Sonuç: Eşit Değil.");
        }
    }



    public void run() {
        checkEquality();
        checkEquality2();
    }



}
