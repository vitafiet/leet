package com.vitafiet;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1); if(rowIndex==0) return list;
        list.add(1); if(rowIndex==1) return list;

        for (int i=2; i<= rowIndex; i++){
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(1);
            for(int n=0; n<list.size()-1; n++){
                newList.add(list.get(n)+list.get(n+1));
            }
            newList.add(1);
            list = newList;
        }


        return list;
    }
}
