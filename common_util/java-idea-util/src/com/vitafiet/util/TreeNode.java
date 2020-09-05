package com.vitafiet.util;

/*
Binary Tree.
 */

public class TreeNode {
    public int val;

    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    /*
    Initializes the tree from an array of Integers.
    The tree elements within the array should be in such that for any node with index "n",
        the left node's index will be: 2n+1
        the right node's index will be: 2n+2
     */
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

    public TreeNode(int val) { this.val = val; }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
