package com.vitafiet;

/*
leetcode execution:
Runtime: 0 ms
Memory Usage: 37.2 MB
 */

public class SolutionUsingCountSort {
    public int hIndex(int[] citations) {

//        int[] count = new int[citations.length + 1];
        int[] count = new int[citations.length + 2]; // allocating extra element.
        // this additional element will be set with "0" and save us from ArrayIndexOutOfBounds
        //  exception below during incremental count in the 2nd "for loop".

        for(int i: citations){
            if(i >= (citations.length) ) count[citations.length]++;
            else count[i]++;
        }

        for(int i= citations.length; i>=0; i--) {
            count[i] += count[i+1];
            if (count[i] >= i) return i;
        }

        return 0;
    }
}
