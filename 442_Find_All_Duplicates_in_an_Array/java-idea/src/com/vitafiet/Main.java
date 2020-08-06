package com.vitafiet;

public class Main {

    public static void main(String[] args) {

        Solution s = new Solution();

        long startTime = 0;
        long endTime = 0;

        int[] arr = new int[] {4,3,2,7,8,2,3,1};
        System.out.println("Arr:" + arrayToStr(arr));
        startTime = System.nanoTime();
        System.out.println("Res:" + s.findDuplicates(arr));
        endTime = System.nanoTime();
        System.out.println("Time:" + (endTime-startTime)/1000 + "ns");
    }

    public static String arrayToStr(int[] arr){
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i < arr.length -1) s = s + ",";
        }
        return s;
    }
}
