package com.vitafiet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*
leetcode execution:
Runtime: 2 ms
Memory Usage: 39.3 MB
 */

class Solution {

    HashMap<Integer, HashMap> map = null;

    int min_x = 0;
    int max_x = 0;

    int min_y = 0; //max_y will always be 0;

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        map = new HashMap<Integer, HashMap>(); //map to store x

        int x = 0;
        int y = 0;

        traverseTree(root, x, y);

        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        for (x = min_x; x <= max_x; x++) {
            if(map.containsKey(x)) {
                HashMap<Integer, ArrayList<Integer>> subMap = map.get(x);
                ArrayList<Integer> elem = new ArrayList<Integer>();
                for(y = 0; y >= min_y; y-- ) {
                    if(subMap.containsKey(y)){
                        ArrayList<Integer> list = subMap.get(y);
                        Collections.sort(list);
                        for(int i : list){
                            elem.add(i);
                        }
                    }
                }
                ret.add(elem);
            }
        }

        return (List) ret;
    }

    public void traverseTree(TreeNode t, int x, int y){

        HashMap<Integer, ArrayList<Integer>> subMap = null;

        if(x < min_x) min_x = x;
        if(x > max_x) max_x = x;
        if(y < min_y) min_y = y;

        if( map.containsKey(x) ) subMap = map.get(x);
        else {
            subMap = new HashMap<Integer, ArrayList<Integer>>();
            map.put(x, subMap);
        }

        ArrayList<Integer> list = null;
        if(subMap.containsKey(y)) {
            list = subMap.get(y);
        } else {
            list = new ArrayList<Integer>();
            subMap.put(y, list);
        }

        list.add(t.val);

        if(t.left != null) traverseTree(t.left, x-1, y-1);
        if(t.right != null) traverseTree(t.right, x+1, y-1);
    }

}
