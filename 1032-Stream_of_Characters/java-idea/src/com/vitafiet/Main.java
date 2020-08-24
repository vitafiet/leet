package com.vitafiet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args)
            throws java.io.FileNotFoundException, java.io.IOException
    {

        long startTime = 0;
        long endTime = 0;

        String propertiesFileName = "testData";


//        Properties props = new Properties();
//        props.put("words1", "[\"ab\",\"ba\",\"aaab\",\"abab\",\"baa\"]");
//        props.put("query1", "[\"a\"],[\"a\"],[\"a\"],[\"a\"],[\"a\"],[\"b\"],[\"a\"],[\"b\"],[\"a\"],[\"b\"],[\"b\"],[\"b\"],[\"a\"],[\"b\"],[\"a\"],[\"b\"],[\"b\"],[\"b\"],[\"b\"],[\"a\"],[\"b\"],[\"a\"],[\"b\"],[\"a\"],[\"a\"],[\"a\"],[\"b\"],[\"a\"],[\"a\"],[\"a\"]");
//        FileOutputStream out = new FileOutputStream(propertiesFileName);
//        props.store(out, "---No Comment---");
//        out.close();

        Properties propRead = new Properties();
        FileInputStream in = new FileInputStream(propertiesFileName);
        propRead.load(in);

        String[] words = null;
        char[] queries  = null;

        for(Object key : propRead.keySet()) {
            String strKey = key.toString();
            String strVal = (propRead.get(key)).toString();
            System.out.println(strKey + ": " + strVal);

            if(strKey.startsWith("word")) words = parseStringArr(strVal);
            if(strKey.startsWith("query")) queries = parseCharArr(strVal);

//            startTime = System.nanoTime();
//            System.out.println("Output1:" + s.getRow(Integer.parseInt(val)));
//            endTime = System.nanoTime();
//            System.out.println("Time1:" + (endTime-startTime)/1000 + "ns");
//
//            startTime = System.nanoTime();
//            System.out.println("Output2:" + sb.getRow(Integer.parseInt(val)));
//            endTime = System.nanoTime();
//            System.out.println("Time2:" + (endTime-startTime)/1000 + "ns");
        }

        in.close();

        StreamChecker s = new StreamChecker(words);
        for(char c: queries)
            System.out.println(c + " query-" + s.query(c));
    }

    public static String arrayToStr(int[] arr){
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i < arr.length -1) s = s + ",";
        }
        return s;
    }

    public static int[] strToArray(String s){
        String[] sList = s.split(",");
        int[] arr = new int[sList.length];

        int i=0;
        for(String str : sList)
            arr[i++] = Integer.parseInt(str);

        return arr;
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
