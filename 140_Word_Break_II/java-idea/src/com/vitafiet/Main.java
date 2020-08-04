package com.vitafiet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> wordDict = null;
        Solution sObj = new Solution();

        System.out.println("1st:");
        String s = "catsanddog";
        wordDict = new ArrayList<String>( Arrays.asList("cat", "cats", "and", "sand", "dog"));
        long startTS = System.nanoTime();
        List<String> list = sObj.wordBreak(s, wordDict);
        long endTS = System.nanoTime();
        printList(list);
        System.out.println("Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.println("2nd:");
        s = "pineapplepenapple";
        wordDict = new ArrayList<String>( Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));
        startTS = System.nanoTime();
        list = sObj.wordBreak(s, wordDict);
        endTS = System.nanoTime();
        printList(list);
        System.out.println("Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.println("3rd:");
        s = "catsandog";
        wordDict = new ArrayList<String>( Arrays.asList("cats", "dog", "sand", "and", "cat"));
        startTS = System.nanoTime();
        list = sObj.wordBreak(s, wordDict);
        endTS = System.nanoTime();
        printList(list);
        System.out.println("Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.println("4th:");
        s = "a";
        wordDict = new ArrayList<String>( Arrays.asList("a"));
        startTS = System.nanoTime();
        list = sObj.wordBreak(s, wordDict);
        endTS = System.nanoTime();
        printList(list);
        System.out.println("Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.println("5th:");
        s = "aaaaaaa";
        wordDict = new ArrayList<String>( Arrays.asList("aaaa","aa","a"));
        startTS = System.nanoTime();
        list = sObj.wordBreak(s, wordDict);
        endTS = System.nanoTime();
        printList(list);
        System.out.println("Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.println("6th:");
        s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        wordDict = new ArrayList<String>( Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
        startTS = System.nanoTime();
        list = sObj.wordBreak(s, wordDict);
        endTS = System.nanoTime();
        printList(list);
        System.out.println("Time=" + (endTS-startTS)/1000 + " micro s");
    }

    private static void printList(List<String> list){
        for (Object o : list.toArray()) {
            System.out.println(o.toString());
        }
    }
}
