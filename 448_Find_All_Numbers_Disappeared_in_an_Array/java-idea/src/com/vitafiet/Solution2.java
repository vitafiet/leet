package com.vitafiet;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> missing = new ArrayList<Integer>();

        for( int i = 0; i < nums.length; i++){

            if(nums[i] != 0 && nums[i] != i+1) {

                int outOfPlaceNo = nums[i];
                nums[i] = 0;

                while(outOfPlaceNo != 0)
                {
                    if (missing.contains(outOfPlaceNo))
                        missing.remove(new Integer(outOfPlaceNo));

                    if(nums[outOfPlaceNo-1] == outOfPlaceNo) { // duplicate
                        outOfPlaceNo = 0; //break
                    } else {
                        int t = nums[outOfPlaceNo-1];
                        nums[outOfPlaceNo-1] = outOfPlaceNo;
                        outOfPlaceNo = t;
//                        System.out.println("Arr:" + arrayToStr(nums));
                    }
                }
            }

            if(nums[i] == 0) {
                missing.add(i+1);
            }

        }

        return missing;
    }

}
