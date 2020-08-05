package com.vitafiet;

public class Main {

    public static void main(String[] args) {

        WordDictionary trie = new WordDictionary();

        trie.addWord("bad");
        trie.addWord("dad");
        trie.addWord("mad");
        System.out.println("Search " + trie.search("pad"));// -> false
        System.out.println("Search " + trie.search("bad"));// -> true
        System.out.println("Search " + trie.search(".ad"));// -> true
        System.out.println("Search " + trie.search("b.."));
    }
}
