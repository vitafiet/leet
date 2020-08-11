package com.vitafiet;

import java.util.Arrays;

/*
leetcode execution:
Runtime: 1 ms
Memory Usage: 37 MB
 */

class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);
//        printArr("Arr: ", citations);

        for(int i=citations.length; i > 0; i--)
            if(isHindex(i, citations)) return i;

        return 0;
    }

    private void printArr(String str, int[] arr){
        System.out.print(str);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length - 1) System.out.print(",");
        }
        System.out.println();
    }

    private boolean isHindex(int idx, int[] citations){

        int gtH_count = 0;
        int i = citations.length-1;
        while (i >=0 && citations[i] >= idx ) {
            gtH_count++;
            i--;
        }

        if(gtH_count < idx) return false;

        return true;
    }
}
