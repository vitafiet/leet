package com.vitafiet;

import com.vitafiet.util.ParseStringTo;
import com.vitafiet.util.PersistentProperties;
//import com.vitafiet.util.TreeNode;

public class Main {

    public static void main(String[] args)
            throws java.io.FileNotFoundException, java.io.IOException
    {

        Solution s = new Solution();

        long startTime = 0;
        long endTime = 0;

        String propertiesFileName = "arrayTestData";
        PersistentProperties p = new PersistentProperties(propertiesFileName);
//        p.writeProperty("arr1", "1,2,0");
//        p.writeProperty("arr2", "3,4,-1,1");
//        p.writeProperty("arr3", "7,8,9,11,12");
//        p.persist();

        for(Object key : p.getAllKeys()) {
            String strKey = key.toString();
            String strVal = (p.getValue(key)).toString();
            System.out.println(strKey + ": " + strVal);

            int[] arr = ParseStringTo.intArray(strVal);
//            for(Integer i : arr)
//                System.out.println(i);

            startTime = System.nanoTime();
            System.out.print("Output: " + s.firstMissingPositive(arr));
            endTime = System.nanoTime();
            System.out.println(" Time: " + (endTime-startTime)/1000 + "ns");
        }


    }
}
