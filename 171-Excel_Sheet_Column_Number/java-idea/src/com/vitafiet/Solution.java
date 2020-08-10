package com.vitafiet;

/*
leetcode execution:
Runtime: 2 ms
Memory Usage: 38.4 MB
 */
class Solution {
    public int titleToNumber(String s) {

        if (s == null || s.length() < 1) return 0;

        s = s.toUpperCase();

        int ret = 0;
        int pos = 0;
        for(int i = s.length() - 1 ; i >= 0; i--, pos++) {
            char ch = s.charAt(i);
//            System.out.println("Pos: " + pos + " Pow: " + Math.pow(26,pos) + " - " + ch);

            if(pos == 0) ret += (ch - 'A' + 1);
            else ret += (ch - 'A' + 1) * Math.pow(26,pos);

        }

        return ret;
    }
}
