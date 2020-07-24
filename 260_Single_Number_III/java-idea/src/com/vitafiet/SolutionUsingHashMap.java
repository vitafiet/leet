package com.vitafiet;

/* Using HashMap data structure.
* We will have a */

import java.util.HashMap;

class SolutionHashMap {
    public int[] singleNumber(int[] nums) {

        HashMap<Integer,Boolean> map = new HashMap<Integer, Boolean>();

        for (int n : nums) {
            if (map.containsKey(n)) map.remove(n);
            else map.put(n,null);
        }

//        System.out.println(map);

        int[] ret = new int[map.keySet().size()];
        int t = 0;
        for (Integer i : map.keySet())
            ret[t++] = i.intValue();
        return ret;
    }
}
