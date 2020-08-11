package com.vitafiet;

/*
leetcode execution:
Runtime: 1 ms
Memory Usage: 37.8 MB
 */
public class Solution {
    public String makeGood(String s) {

        if(s.length() < 2) return s;

        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length()-1; i++){
//            System.out.println("i=" + i + " ch=" + sb.charAt(i) + " next:" + sb.charAt(i+1));
            if(sb.charAt(i) - sb.charAt(i+1) == 32 ||
                    sb.charAt(i+1) - sb.charAt(i) == 32){
                sb.delete(i, i+2);
                if(i < 2) i = -1;
                else i= i-2;
            }
        }
        return sb.toString();
    }
}
