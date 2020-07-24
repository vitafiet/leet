package com.vitafiet;

/* Using HashMap data structure.
(a) Visit each node element once [linear complexity O(n)]
(b) Build a hashmap - if key is found, clear it from Map. Else, add the key to the map.
This will add to storage complexity (storing a Map). */

import java.util.HashMap;

class SolutionUsingHashMap {
    public int[] singleNumber(int[] nums) {

        HashMap<Integer,Boolean> map = new HashMap<Integer, Boolean>();

        for (int n : nums) {
            if (map.containsKey(n)) map.remove(n);
            else map.put(n,null);
        }

        int[] ret = new int[map.keySet().size()];
        int t = 0;
        for (Integer i : map.keySet())
            ret[t++] = i.intValue();
        return ret;
    }
}
