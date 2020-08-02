package com.vitafiet;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();

        String word = "Hi";
        System.out.println("Ans:" + s.detectCapitalUse(word));

        word = "USA";
        System.out.println("Ans:" + s.detectCapitalUse(word));

        word = "leetcode";
        System.out.println("Ans:" + s.detectCapitalUse(word));

        word = "Google";
        System.out.println("Ans:" + s.detectCapitalUse(word));

        word = "FlaG";
        System.out.println("Ans:" + s.detectCapitalUse(word));
    }
}
