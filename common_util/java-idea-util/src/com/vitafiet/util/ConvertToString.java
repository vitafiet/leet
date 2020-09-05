package com.vitafiet.util;

public class ConvertToString {

    public static String intArray(int[] arr){
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i < arr.length -1) s = s + ",";
        }
        return s;
    }


}
