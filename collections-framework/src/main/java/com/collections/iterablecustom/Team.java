package com.collections.iterablecustom;

import java.util.*;

public class Team implements Iterable<String> {
    private List<String> players = new ArrayList<>();
    private int modCount = 0;
    public void addPlayer(String playerName) {
        players.add(playerName);
        modCount++;
        System.out.println("Total Players : " + players.size());
    }
    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;
            private int expectedModCount = modCount;

            private void checkModCount () {
                if (modCount != expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override
            public boolean hasNext() {
                /*
                if (total < players.size()) {
                    return true;
                }
                return false;
                */
                checkModCount();
                return currentIndex < players.size();
            }

            @Override
            public String next() {
                checkModCount();
                if (!hasNext()) {
                    /*
                    Iterator.next() eğer başka eleman yoksa NoSuchElementException fırlatır.
                    */
                    throw new NoSuchElementException();
                }
                String player = players.get(currentIndex);
                currentIndex++;
                // System.out.println("Left : " + (count - total));
                return player;
            }

            @Override
            public void remove() {
                if (currentIndex == 0) {
                    throw new IllegalStateException();
                }
                players.remove(currentIndex-1);
                currentIndex--;
            }
        };
        // return players.iterator();
    }
}
