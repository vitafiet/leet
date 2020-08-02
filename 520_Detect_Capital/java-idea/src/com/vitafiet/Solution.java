package com.vitafiet;

class Solution {
    public boolean detectCapitalUse(String word) {

        boolean allCaps = true;
        boolean allSmall = true;
        boolean firstCap = true;

        char[] chArrWord = word.toCharArray();
        int pos = 0;
        for (char c : chArrWord) {
            if(Character.isUpperCase(c)){
                allSmall = false;
                if(pos != 0) firstCap = false;
            } else if(Character.isLowerCase(c)){
                allCaps = false;
                if(pos == 0) firstCap = false;
            }

            if(!(allCaps|allSmall|firstCap)) return false;
            pos++;
        }

        if(allCaps | allSmall | firstCap) return true;
        return false;
    }
}