package com.vitafiet;

import java.util.HashMap;

/*
leetcode execution: --> definitely needs improvement.
Runtime: 97 ms
Memory Usage: 125.2 MB
 */

class Trie {

    HashMap<Character,Trie> map = null;
    boolean isWord;

    public Trie() {
        map = new HashMap<Character, Trie>();
        isWord = false;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word != null && word.length() == 0) return;
        else if(word != null && word.length() == 1) {
            char ch = word.charAt(0);
            if(map.containsKey(ch)) {
                Trie t = map.get(ch);
                t.isWord = true;
            } else {
                Trie t = new Trie();
                t.isWord = true;
                map.put(ch, t);
            }
        } else if(word != null && word.length() > 1) {
            char ch = word.charAt(0);
            if (map.containsKey(ch)) {
                Trie t = map.get(ch);
                t.insert(word.substring(1));
            } else {
                Trie t = new Trie();
                map.put(ch, t);
                t.insert(word.substring(1));
            }
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

        if(word != null && word.length() == 1){
            char ch = word.charAt(0);
            if (map.containsKey(ch)) {
                Trie t = map.get(ch);
                return t.isWord;
            } else {
                return false;
            }
        } else if(word != null && word.length() > 1){
            char ch = word.charAt(0);
            if (map.containsKey(ch)) {
                Trie t = map.get(ch);
                if (t == null) return false;
                else return t.search(word.substring(1));
            } else {
                return false;
            }
        }

        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {

        if(prefix != null && prefix.length() == 1){
            char ch = prefix.charAt(0);
            if (map.containsKey(ch)) {
                return true;
            } else {
                return false;
            }
        } else if(prefix != null && prefix.length() > 1){
            char ch = prefix.charAt(0);
            if (map.containsKey(ch)) {
                Trie t = map.get(ch);
                if (t == null) return false;
                else return t.startsWith(prefix.substring(1));
            } else {
                return false;
            }
        }

        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
