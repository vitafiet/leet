package com.vitafiet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args)
            throws java.io.FileNotFoundException, java.io.IOException
    {
        Solution s = new Solution();
        Solution2 s2 = new Solution2();

        long startTime = 0;
        long endTime = 0;

        String propertiesFileName = "arrayTestData";

//        Properties props = new Properties();
//        props.put("Array1", arrayToStr(arr1));
//        props.put("Array2", "Jefferson City");
//        FileOutputStream out = new FileOutputStream(propertiesFileName);
//        props.store(out, "---No Comment---");
//        out.close();

        Properties propRead = new Properties();
        FileInputStream in = new FileInputStream(propertiesFileName);
        propRead.load(in);

        for(Object key : propRead.keySet()) {
            String arrName = key.toString();
            String strArr = (propRead.get(key)).toString();
            int[] arr = strToArray(strArr);
            System.out.println(arrName + " : " + arrayToStr(arr));

            startTime = System.nanoTime();
            System.out.print("Res1:" + s.findDisappearedNumbers(arr));
            endTime = System.nanoTime();
            System.out.println(" Time:" + (endTime-startTime)/1000 + "ns");

            startTime = System.nanoTime();
            System.out.print("Res2:" + s2.findDisappearedNumbers(arr));
            endTime = System.nanoTime();
            System.out.println(" Time:" + (endTime-startTime)/1000 + "ns");
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

    public static int[] strToArray(String s){
        String[] sList = s.split(",");
        int[] arr = new int[sList.length];

        int i=0;
        for(String str : sList)
            arr[i++] = Integer.parseInt(str);

        return arr;
    }
}
