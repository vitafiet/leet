package com.vitafiet;

import java.util.HashMap;

class WordDictionary {

    /** Initialize your data structure here. */
    HashMap<Character,WordDictionary> map = null;
    boolean isWord;

    public WordDictionary() {
        map = new HashMap<Character, WordDictionary>();
        isWord = false;
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        if(word != null && word.length() == 0) return;
        else if(word != null && word.length() == 1) {
            char ch = word.charAt(0);
            if(map.containsKey(ch)) {
                WordDictionary t = map.get(ch);
                t.isWord = true;
            } else {
                WordDictionary t = new WordDictionary();
                t.isWord = true;
                map.put(ch, t);
            }
        } else if(word != null && word.length() > 1) {
            char ch = word.charAt(0);
            if (map.containsKey(ch)) {
                WordDictionary t = map.get(ch);
                t.addWord(word.substring(1));
            } else {
                WordDictionary t = new WordDictionary();
                map.put(ch, t);
                t.addWord(word.substring(1));
            }
        }
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {

        if(word != null && word.length() == 1){
            char ch = word.charAt(0);
            if(ch == '.'){
//                System.out.println("Processing last '.' for the word");
                boolean result = false;
                for(WordDictionary t : map.values())
                {
                    result = t.isWord;
                    if (result) break;
                }
                return result;
            } else if (map.containsKey(ch)) {
                WordDictionary t = map.get(ch);
                return t.isWord;
            } else {
                return false;
            }
        } else if(word != null && word.length() > 1){
            char ch = word.charAt(0);
            if(ch == '.'){
//                System.out.println("Processing a '.'...");
                boolean result = false;
                for(WordDictionary t : map.values())
                {
                    result = t.search(word.substring(1));
                    if (result) break;
                }
                return result;
            } else if (map.containsKey(ch)) {
                WordDictionary t = map.get(ch);
                if (t == null) return false;
                else return t.search(word.substring(1));
            } else {
                return false;
            }
        }

        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
