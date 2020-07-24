package com.vitafiet;

import java.util.Arrays;

/*
Sorting the list of arrays first. n*log(n) complexity.
Go over the sorted array to find unique values (linear time complexity).
 */

public class SolutionUsingSort {

    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);

        int[] ret = new int[2];
        int i=0;
        int n=0;
        while (n < nums.length){
            if (n == nums.length - 1) {
                ret[i++] = nums[n];
                break;
            }
            else if (nums[n] == nums[n+1]) n+=2;
            else {
                ret[i++] = nums[n];
                n++;
            }
        }

        return ret;
    }
}
