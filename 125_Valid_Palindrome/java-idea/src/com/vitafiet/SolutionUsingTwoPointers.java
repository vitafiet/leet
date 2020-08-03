package com.vitafiet;

// leetcode--
// Runtime: 2 ms
// Memory Usage: 39.9 MB

public class SolutionUsingTwoPointers {

    public boolean isPalindrome(String s) {

        int startPtr = 0;
        int endPtr = s.length()-1;

        while(startPtr <= endPtr || endPtr-startPtr > 1){
            if( !Character.isLetterOrDigit( s.charAt(startPtr) ) ) startPtr++;
            else if(!Character.isLetterOrDigit( s.charAt(endPtr) ) ) endPtr--;
            else if( Character.toLowerCase(s.charAt(startPtr))
                        != Character.toLowerCase(s.charAt(endPtr)) ) return false;
            else {
                startPtr++;
                endPtr--;
            }
        }
        return true;
    }
}
