package com.vitafiet;

class Solution {
    public boolean isPalindrome(String s) {

        String inputStr = s.toLowerCase();
//        System.out.println("Lowercase: " + inputStr);
        inputStr = inputStr.replaceAll("[^a-zA-Z0-9]+", "");
//        System.out.println("Regex'd: " + inputStr);

        StringBuilder sb = new StringBuilder(inputStr);
        String reverseStr = sb.reverse().toString();

        return (inputStr.equals(reverseStr));
    }
}
