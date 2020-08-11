package com.vitafiet;

import java.util.Arrays;

/*
leetcode execution:
Runtime: 0 ms
Memory Usage: 37.8 MB
 */

public class Solution2 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++)
        {
            if(citations[i]>=n-i)
            {
                return (n-i);
            }
        }
        return 0;
    }
}
