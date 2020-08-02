package com.vitafiet;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        Solution2 s2 = new Solution2();

        int[] arr = new int[] {1,2,3,4};
        System.out.println("Result: " + s.findUnsortedSubarray(arr));
        System.out.println("Result2: " + s2.findUnsortedSubarray(arr));
    }
}
