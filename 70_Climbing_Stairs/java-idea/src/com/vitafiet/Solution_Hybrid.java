package com.vitafiet;

import java.util.HashMap;

public class Solution_Hybrid {

    HashMap<Integer, Integer> map = null;

    public int climbStairs(int n) {
        if(n<=12) return climbStairs_C(n);
        else {
            map = new HashMap<Integer, Integer>();
            map.put(0,0); // you're at the top.
            map.put(1,1); // take the last step to the top.
            return climbStairs_M(n);
        }
    }

    private int climbStairs_C(int n) {
        if (n == 0) return 0; // you're at the top.
        if (n == 1) return 1; // take the last step to the top.

        int ways = 0;

        if (n - 2 == 0) { //  you were two steps away from the top.
            ways++;
        } else {
            ways = ways + climbStairs_C(n-2);
        }

        ways = ways + climbStairs_C(n-1);

        return ways;
    }

    private int climbStairs_M(int n) {

        if(map.containsKey(n)) return map.get(n);

        int ways = 0;

        if (n - 2 == 0) { //  you were two steps away from the top.
            ways++;
        } else {
            ways = ways + climbStairs_M(n-2);
        }

        ways = ways + climbStairs_M(n-1);

        map.put(n, ways);
        return ways;
    }
}
