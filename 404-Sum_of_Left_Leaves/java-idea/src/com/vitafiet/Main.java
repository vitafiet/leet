package com.vitafiet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Main {

    public static void main(String[] args)
            throws java.io.FileNotFoundException, java.io.IOException
    {

        Solution s = new Solution();
        Solution1 s1 = new Solution1();

        long startTime = 0;
        long endTime = 0;

        String propertiesFileName = "treeTestData";


        Properties props = new Properties();
        props.put("tree1", "3,9,20,null,null,15,7");
        props.put("tree2", "3");
        props.put("tree3", "");
        FileOutputStream out = new FileOutputStream(propertiesFileName);
        props.store(out, "---No Comment---");
        out.close();

        Properties propRead = new Properties();
        FileInputStream in = new FileInputStream(propertiesFileName);
        propRead.load(in);

        for(Object key : propRead.keySet()) {
            String strKey = key.toString();
            String strVal = (propRead.get(key)).toString();
            System.out.println(strKey + ": " + strVal);

            Integer[] arr = strToIntegerArray(strVal);
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

        in.close();
    }

    public static String arrayToStr(int[] arr){
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i < arr.length -1) s = s + ",";
        }
        return s;
    }

    public static int[] strToIntArray(String s){
        String[] sList = s.split(",");
        int[] arr = new int[sList.length];

        int i=0;
        for(String str : sList)
            arr[i++] = Integer.parseInt(str);

        return arr;
    }

    public static Integer[] strToIntegerArray(String s){
//        System.out.println("Parsing string to 'Integer':" + s);

        String[] strArr = s.split(",");
        Integer[] ret = new Integer[strArr.length];

        for(int i = 0; i<ret.length; i++){
            if(strArr[i].equals("null") || strArr[i].equals("")) ret[i] = null;
            else ret[i] = Integer.parseInt(strArr[i]);
        }

        return ret;
    }

    private static void printArr(String str, int[] arr){
        System.out.print(str);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length - 1) System.out.print(",");
        }
        System.out.println();
    }

    private static String[] parseStringArr(String str) {
        str = str.replaceAll("\"|\\]|\\[", "");
        System.out.println("Parsing to StrArr: " + str);

        return str.split(",");
    }

    private static char[] parseCharArr(String str) {
        str = str.replaceAll("\"|\\]|\\[", "");
        System.out.println("Parsing to CharArr: " + str);
        String[] strArr = str.split(",");
        char[] ret = new char[strArr.length];
        for(int i=0; i<strArr.length; i++)
            ret[i] = strArr[i].charAt(0);
        return ret;
    }
}