package com.vitafiet;

import java.util.ArrayList;

public class TreeNode {
    int val;

    TreeNode left;
    TreeNode right;

    TreeNode() {}

    public void initialize(Integer[] nodesList, int id){

        if(nodesList == null || nodesList.length < 1 || nodesList[id] == null) return;

        val = nodesList[id];
        int left_id = id * 2 + 1;
        int right_id = id * 2 + 2;

        if(left_id < nodesList.length && nodesList[left_id] != null)
        {
            left = new TreeNode();
            left.initialize(nodesList, left_id);
        }

        if(right_id < nodesList.length && nodesList[right_id] != null)
        {
            right = new TreeNode();
            right.initialize(nodesList, right_id);
        }

    }

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
