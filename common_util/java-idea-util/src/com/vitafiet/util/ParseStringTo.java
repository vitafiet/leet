package com.vitafiet.util;

public class ParseStringTo {

    public static int[] intArray(String s){
        String[] sList = s.split(",");
        int[] arr = new int[sList.length];

        int i=0;
        for(String str : sList)
            arr[i++] = Integer.parseInt(str);

        return arr;
    }

    public static Integer[] integerArray(String s){
//        System.out.println("Parsing string to 'Integer':" + s);

        String[] strArr = s.split(",");
        Integer[] ret = new Integer[strArr.length];

        for(int i = 0; i<ret.length; i++){
            if(strArr[i].equals("null") || strArr[i].equals("")) ret[i] = null;
            else ret[i] = Integer.parseInt(strArr[i]);
        }

        return ret;
    }

    private static char[] charArray(String str) {
        str = str.replaceAll("\"|\\]|\\[", "");
        System.out.println("Parsing to CharArr: " + str);
        String[] strArr = str.split(",");
        char[] ret = new char[strArr.length];
        for(int i=0; i<strArr.length; i++)
            ret[i] = strArr[i].charAt(0);
        return ret;
    }

    private static String[] stringArray(String str) {
        str = str.replaceAll("\"|\\]|\\[", "");
        System.out.println("Parsing to StrArr: " + str);

        return str.split(",");
    }


}
