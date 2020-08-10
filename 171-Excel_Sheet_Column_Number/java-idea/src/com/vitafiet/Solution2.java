package com.vitafiet;

/*
leetcode execution:
Runtime: 1 ms
Memory Usage: 38 MB
 */
public class Solution2 {
    public int titleToNumber(String s) {

        if (s == null || s.length() < 1) return 0;

        int ret = 0;
        int pos = 1;
        for(int i = s.length() - 1 ; i >= 0; i--) {
            char ch = s.charAt(i);
//            System.out.println("Pos: " + pos + " Pow: " + Math.pow(26,pos) + " - " + ch);

            if(pos == 0) ret += (ch - 'A' + 1);
            else ret += (ch - 'A' + 1) * pos;

            pos *= 26;
        }

        return ret;
    }
}