package com.vitafiet;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode execution:
Runtime: 5 ms
Memory Usage: 48.8 MB
 */

class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for( int i = 0; i < nums.length; i++){
//            System.out.println("Arr:" + arrayToStr(nums) + " i-->" + i);
            if(nums[i] == 0 || nums[i] == i+1){ continue;}
            else {

                int outOfPlaceNo = nums[i];
                nums[i] = 0;

                while(outOfPlaceNo != 0)
                {
                    if(nums[outOfPlaceNo-1] == outOfPlaceNo) { // duplicate
                        duplicates.add(outOfPlaceNo);
//                        System.out.println("duplicate: " + outOfPlaceNo);
                        outOfPlaceNo = 0;
                    } else {
                        int t = nums[outOfPlaceNo-1];
                        nums[outOfPlaceNo-1] = outOfPlaceNo;
                        outOfPlaceNo = t;
//                        System.out.println("Arr:" + arrayToStr(nums));
                    }
                }
            }
        }

        return duplicates;
    }

//    private String arrayToStr(int[] arr){
//        String s = "";
//        for (int i = 0; i < arr.length; i++) {
//            s = s + arr[i];
//            if (i < arr.length -1) s = s + ",";
//        }
//        return s;
//    }
}
