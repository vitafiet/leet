package com.vitafiet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Binomial Coefficient (k-th coefficient) = factorial(n) / factorial(k) * factorial(n-k) .....(1)

therefore: (k-1 th coefficient) = factorial(n) / factorial(k-1) * factorial(n-k-1) .....(2)

(k-th) / (k-1 th) coefficient =>  dividing equations (1) and (2)
        => (n - k + 1)/k

So, k-th coeff. = (k-1 th coeff) * ( (n-k+1)/k )

 */

/*
leetcode runtime:
Runtime: 0 ms
Memory Usage: 37 MB
 */

public class SolutionBinomialCoefficient {

    public List<Integer> getRow(int rowIndex) {
        Integer[] arr = new Integer[rowIndex+1];
        arr[0] = 1;

        for(int i=1; i<=rowIndex; i++) {
            arr[i] = (int) ((long)arr[i-1] * (rowIndex - i + 1) / i);
        }
        return Arrays.asList(arr);
    }
}
