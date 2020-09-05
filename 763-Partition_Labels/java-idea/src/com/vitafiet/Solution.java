package com.vitafiet;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String S) {

        int[] arr = new int['z'-'a'+1];

        for(int i = 0; i<S.length(); i++){
            char c = S.charAt(i);
            arr[c - 'a'] = i;
        }

        //for(int i = 0; i<arr.length; i++)
        //    System.out.println(arr[i]);

        List<Integer> ret = new ArrayList<>();
        int start = -1;
        int end = -1;
        for(int pos = 0; pos<S.length(); pos++){
            char c = S.charAt(pos);
            if(start == -1) {
                start = pos;
                end = arr[c - 'a'];
            }
            else if(arr[c - 'a'] > end) end = arr[c - 'a'];
            if(pos == end){
                ret.add(end - start + 1);
                start = -1;
                end = -1;
            }
        }



        return ret;
    }
}
