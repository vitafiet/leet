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

        long startTime = 0;
        long endTime = 0;

//        String propertiesFileName = "strTestData";
        PersistentProperties p = new PersistentProperties("strTestData");
//        p.writeProperty("s1", "ababcbacadefegdehijhklij");
//        p.writeProperty("s2", "a");
//        p.persist();

        for(Object key : p.getAllKeys()) {
            String strKey = key.toString();
            String strVal = (p.getValue(key)).toString();
            System.out.println(strKey + ": " + strVal);

            startTime = System.nanoTime();
            System.out.print("Output1:" + s.partitionLabels(strVal));
            endTime = System.nanoTime();
            System.out.println(" Time1:" + (endTime-startTime)/1000 + "ns");
        }

    }

}