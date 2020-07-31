package com.vitafiet;

import java.util.HashMap;

public class Solution_Memoization {

    HashMap<Integer, Integer> map = null;

    public Solution_Memoization(){
        map = new HashMap<Integer, Integer>();
        map.put(0,0); // you're at the top.
        map.put(1,1); // take the last step to the top.
    }

    public int climbStairs(int n) {

        if(map.containsKey(n)) return map.get(n);

        int ways = 0;

        if (n - 2 == 0) { //  you were two steps away from the top.
            ways++;
        } else {
            ways = ways + climbStairs(n-2);
        }

        ways = ways + climbStairs(n-1);

        map.put(n, ways);
        return ways;
    }

}
