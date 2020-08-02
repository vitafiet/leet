package com.vitafiet;

import java.util.Arrays;

public class SolutionUsingXOR {

    public int[] singleNumber(int[] nums) {

        int res = 0;

        for (int n : nums)
            res ^= n;

//        int mask = res & (~res);
        int mask = res & (~(res-1));

//        int one = 0;
//        for (int n : nums) {
//            if ((n & mask) == 0) {
//                one ^= n;
//            }
//        }
//
//        int two = res ^ one;
//
//        return new int[]{one, two};

        int[] arr = new int[2];
        for (int n : nums) {
            if ((mask & n) == 0)
                arr[0] ^= n;
            else
                arr[1] ^= n;
        }
        return arr;
    }
}
