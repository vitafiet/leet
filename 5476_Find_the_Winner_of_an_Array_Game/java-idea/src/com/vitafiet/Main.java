package com.vitafiet;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = new int[] {2,1,3,5,4,6,7};
        int k = 2;
        System.out.println("Winner=" + s.getWinner(arr, k));

        arr = new int[] {3,2,1};
        k = 10;
        System.out.println("Winner=" + s.getWinner(arr, k));

        arr = new int[] {1,9,8,2,3,7,6,4,5};
        k = 7;
        System.out.println("Winner=" + s.getWinner(arr, k));

        arr = new int[] {1,11,22,33,44,55,66,77,88,99};
        k = 1000000000;
        System.out.println("Winner=" + s.getWinner(arr, k));

    }
}
