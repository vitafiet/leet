package com.vitafiet;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.singleNumber(new int[]{1,2,1,3,2,5});
        if (result != null){
            for (int i : result)
                System.out.println(i);
        }
    }
}
