package com.vitafiet;

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
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {

        int sum = 0;
        if(root == null || (root.left == null && root.right == null) ) return sum;

//        if(root.left != null && root.left.left == null && root.left.right == null)
//            sum += root.left.val;
//        else sum += sumOfLeftLeaves(root.left);
//
//        sum += sumOfLeftLeaves(root.right);

         sum += sumOfLeft(root.left);
         sum += sumOfRight(root.right);

        return sum;
    }

     private int sumOfLeft(TreeNode node) {
         if(node == null) return 0;

         if(node.left == null && node.right == null)
             return node.val;

         int sum = 0;
         sum += sumOfLeft(node.left);
         sum += sumOfRight(node.right);

         return sum;
     }

     private int sumOfRight(TreeNode node) {
         if(node == null) return 0;

         if(node.left == null && node.right == null)
             return 0;

         int sum = 0;
         sum += sumOfLeft(node.left);
         sum += sumOfRight(node.right);

         return sum;
     }
}