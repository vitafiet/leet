package com.vitafiet;

import com.vitafiet.util.ParseStringTo;
import com.vitafiet.util.PersistentProperties;
import com.vitafiet.util.TreeNode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args)
            throws java.io.FileNotFoundException, java.io.IOException
    {

        Solution s = new Solution();
        Solution1 s1 = new Solution1();

        long startTime = 0;
        long endTime = 0;

//        String propertiesFileName = "treeTestData";

        PersistentProperties p = new PersistentProperties("treeTestData");
        p.writeProperty("tree1", "3,9,20,null,null,15,7");
        p.writeProperty("tree2", "3");
        p.writeProperty("tree3", "");
//        p.persist();

//        Properties props = new Properties();
//        props.put("tree1", "3,9,20,null,null,15,7");
//        props.put("tree2", "3");
//        props.put("tree3", "");
//        FileOutputStream out = new FileOutputStream(propertiesFileName);
//        props.store(out, "---No Comment---");
//        out.close();

//        Properties propRead = new Properties();
//        FileInputStream in = new FileInputStream(propertiesFileName);
//        propRead.load(in);

//        for(Object key : propRead.keySet()) {
//            String strKey = key.toString();
//            String strVal = (propRead.get(key)).toString();
        for(Object key : p.getAllKeys()) {
            String strKey = key.toString();
            String strVal = (p.getValue(key)).toString();
            System.out.println(strKey + ": " + strVal);

            Integer[] arr = ParseStringTo.integerArray(strVal);
//            for(Integer i : arr)
//                System.out.println(i);

            TreeNode rootNode = new TreeNode();
            rootNode.initialize(arr, 0);

            startTime = System.nanoTime();
            System.out.print("Output1:" + s.sumOfLeftLeaves(rootNode));
            endTime = System.nanoTime();
            System.out.println(" Time1:" + (endTime-startTime)/1000 + "ns");

            startTime = System.nanoTime();
            System.out.print("Output2:" + s1.sumOfLeftLeaves(rootNode));
            endTime = System.nanoTime();
            System.out.println(" Time2:" + (endTime-startTime)/1000 + "ns");
        }

//        in.close();
    }




}