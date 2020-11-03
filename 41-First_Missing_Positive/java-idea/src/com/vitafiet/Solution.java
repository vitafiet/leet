package com.vitafiet;

import java.util.HashMap;

class Solution {

    public int firstMissingPositive(int[] nums) {

        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>(nums.length);

        for(int n : nums){
            if(n > 0) map.put(n,true);
        }

        int minInt = 1;
        while(map.containsKey(minInt)) minInt++;

        return minInt;
    }

}
