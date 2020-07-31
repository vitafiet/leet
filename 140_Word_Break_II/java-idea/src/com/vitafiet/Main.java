package com.vitafiet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<String>( Arrays.asList("cat", "cats", "and", "sand", "dog"));

        System.out.println("1st:");
        Solution sObj = new Solution();
        List<String> list = sObj.wordBreak(s, wordDict);
        printList(list);

//        System.out.println("2nd:");
//        s = "pineapplepenapple";
//        wordDict = new ArrayList<String>( Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));
//        list = sObj.wordBreak(s, wordDict);
//        printList(list);
//
//        System.out.println("3rd:");
//        s = "catsandog";
//        wordDict = new ArrayList<String>( Arrays.asList("cats", "dog", "sand", "and", "cat"));
//        list = sObj.wordBreak(s, wordDict);
//        printList(list);
//
//        System.out.println("4th:");
//        s = "a";
//        wordDict = new ArrayList<String>( Arrays.asList("a"));
//        list = sObj.wordBreak(s, wordDict);
//        printList(list);
//
//        System.out.println("5th:");
//        s = "aaaaaaa";
//        wordDict = new ArrayList<String>( Arrays.asList("aaaa","aa","a"));
//        list = sObj.wordBreak(s, wordDict);
//        printList(list);

        System.out.println("6th:");
        s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        wordDict = new ArrayList<String>( Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
        list = sObj.wordBreak(s, wordDict);
        printList(list);
    }

    private static void printList(List<String> list){
        for (Object o : list.toArray()) {
            System.out.println(o.toString());
        }
    }
}
