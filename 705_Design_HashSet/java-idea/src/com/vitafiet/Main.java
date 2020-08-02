package com.vitafiet;

public class Main {

    public static void main(String[] args) {

        MyHashSet hash = new MyHashSet();

        hash.add(0);
        hash.remove(0);
        hash.add(1);
        hash.contains(1);    // returns true
        hash.remove(1);
        hash.contains(3);    // returns false (not found)
        hash.add(2);
        hash.contains(2);    // returns true
        hash.remove(2);
        hash.contains(2);    // returns false (already removed)
        hash.add(7);
        hash.add(8);
        hash.add(9);
        hash.remove(9);
        hash.contains(8);    // returns true
        hash.contains(9);    // returns true

        hash.add(128);
        hash.contains(128);
        hash.remove(128);
        hash.contains(128);
    }
}
