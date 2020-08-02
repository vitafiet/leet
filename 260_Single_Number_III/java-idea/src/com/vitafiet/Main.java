package com.vitafiet;

public class Main {

    public static void main(String[] args) {

        int[] problemArr = new int[]{1,2,1,3,2,5};

        SolutionUsingHashMap s = new SolutionUsingHashMap();
        int[] result = s.singleNumber(problemArr);
        print2Ints(result);

        SolutionUsingSort s1 = new SolutionUsingSort();
        result = s1.singleNumber(problemArr);
        print2Ints(result);

        SolutionUsingXOR s2 = new SolutionUsingXOR();
        result = s2.singleNumber(problemArr);
        print2Ints(result);
    }

    private static void print2Ints(int[] arr){
        int n = 0;
        for (int i : arr) {
            System.out.print(i + (n++ == 0 ? "," : "\n"));
        }
    }
}
