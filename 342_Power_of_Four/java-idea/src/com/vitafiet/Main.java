package com.vitafiet;

public class Main {

    public static void main(String[] args) {

        Solution s = new Solution();

        int input = 16;
        System.out.println("Input:" + input + " Res:" + s.isPowerOfFour(input));

        input = 5;
        System.out.println("Input:" + input + " Res:" + s.isPowerOfFour(input));

        input = 0;
        System.out.println("Input:" + input + " Res:" + s.isPowerOfFour(input));

    }
}
