package com.vitafiet;

class Solution {
    public int getWinner(int[] arr, int k) {

        int win=0;

        int pos = 1;
        while (win < k){
            if(arr[0] > arr[pos])
                win++;
            else {
                int temp = arr[0];
                arr[0] = arr[pos];
                arr[pos] = temp;
                win = 1;
            }

            pos++;
            if(pos == arr.length) pos = 1;
        }

        return arr[0];
    }
}