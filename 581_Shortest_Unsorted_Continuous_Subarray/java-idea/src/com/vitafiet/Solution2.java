package com.vitafiet;

class Solution2 {
    public int findUnsortedSubarray(int[] nums) {

        int n = nums.length;
        if(n == 1) return 0;

        int min = nums[n-1];
        int head = -1;
        for (int i = n-2;i >= 0;i--) {
            if(nums[i] <= min)
                min = nums[i];
            else
                head = i;
        }
        if(head == -1) return 0;

        int max = nums[0];
        int tail = -1;
        for (int j = 1;j < n;j++) {
            if(nums[j] >= max)
                max = nums[j]; 
            else
                tail = j;
        }
        return tail - head + 1;
    }
}
