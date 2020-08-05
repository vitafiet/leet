package com.vitafiet;

public class Main {

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println("Search " + trie.search("apple"));   // returns true
        System.out.println("Search " + trie.search("app"));     // returns false
        System.out.println("starts with " + trie.startsWith("app")); // returns true
        System.out.println("starts with " + trie.startsWith("apn"));
        trie.insert("app");
        System.out.println("Search " + trie.search("app"));     // returns true

    }
}
