package com.vitafiet;

import sun.reflect.generics.tree.Tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() { }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(String treeArr){

        String[] strArr = treeArr.split(",");
        int id = 0;
        this.val = Integer.parseInt(strArr[id]);

        int idLeft = 2 * id + 1;
        if(idLeft < strArr.length && !strArr[idLeft].equals("null")){
            left = new TreeNode(idLeft, strArr);
        }

        int idRight = idLeft + 1; // 2*id + 2;
        if(idRight < strArr.length && !strArr[idRight].equals("null")){
            right = new TreeNode(idRight, strArr);
        }
    }

    TreeNode(int id, String[] strArr){
        this.val = Integer.parseInt(strArr[id]);

        int idLeft = 2 * id + 1;
        if(idLeft < strArr.length && !strArr[idLeft].equals("null")){
            left = new TreeNode(idLeft, strArr);
        }

        int idRight = idLeft + 1; // 2*id + 2;
        if(idRight < strArr.length && !strArr[idRight].equals("null")){
            right = new TreeNode(idRight, strArr);
        }
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
