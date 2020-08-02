package com.vitafiet;

class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int startPos = 0;
        int endPos = nums.length - 1;

        while (isSmallestGoingRight(startPos, nums) && startPos <= nums.length-1)
            startPos++;
//        System.out.println("Smallest: " + startPos);

        while (isLargestGoingLeft(endPos, nums) && endPos >= 0)
            endPos--;
//        System.out.println("Largest: " + endPos);

        if (startPos >= nums.length && endPos < 0) return 0;
        return endPos - startPos + 1;
    }

    private boolean isSmallestGoingRight(int pos, int[] nums) {

        for (int i = pos + 1; i <= nums.length-1; i++)
            if (nums[pos] > nums[i]) return false;
        return true;
    }

    private boolean isLargestGoingLeft(int pos, int[] nums) {
        for (int i = pos - 1; i >= 0; i--) {
            if (nums[i] > nums[pos]) return false;
        }
        return true;
    }
}