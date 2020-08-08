package com.vitafiet;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class Main {

    public static void main(String[] args)
            throws java.io.FileNotFoundException, java.io.IOException
    {

        long startTime = 0;
        long endTime = 0;

        String propertiesFileName = "treeTestData";

//        Properties props = new Properties();
//        props.put("Array1", arrayToStr(arr1));
//        props.put("Array2", "Jefferson City");
//        FileOutputStream out = new FileOutputStream(propertiesFileName);
//        props.store(out, "---No Comment---");
//        out.close();

        Properties propRead = new Properties();
        FileInputStream in = new FileInputStream(propertiesFileName);
        propRead.load(in);

        Solution s = new Solution();

        for(Object key : propRead.keySet()) {
            String treeName = key.toString();
            String treeArr = (propRead.get(key)).toString();
            System.out.println(treeName + " : " + treeArr);
            TreeNode t = new TreeNode(treeArr);
            List l = s.verticalTraversal(t);
            System.out.println("Vertical Order: " + l.toString());


//            startTime = System.nanoTime();
//            System.out.print("Res1:" + s.findDisappearedNumbers(arr));
//            endTime = System.nanoTime();
//            System.out.println(" Time:" + (endTime-startTime)/1000 + "ns");

        }

        in.close();
    }
}
