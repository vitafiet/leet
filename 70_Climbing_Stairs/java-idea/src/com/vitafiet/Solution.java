package com.vitafiet;

class Solution {

    public int climbStairs(int n) {
        if (n == 0) return 0; // you're at the top.
        if (n == 1) return 1; // take the last step to the top.

        int ways = 0;

        if (n - 2 == 0) { //  you were two steps away from the top.
            ways++;
        } else {
            ways = ways + climbStairs(n-2);
        }

        ways = ways + climbStairs(n-1);

        return ways;
    }
}
