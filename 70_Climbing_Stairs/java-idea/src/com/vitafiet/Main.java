package com.vitafiet;

import java.sql.Timestamp;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        Solution s = new Solution();
        Solution_Memoization2 s = new Solution_Memoization2();
        Solution_Memoization sm = null;
        Solution_Hybrid sh = new Solution_Hybrid();


        int n = 2;
        System.out.print("n=" + n);
        long startTS = System.nanoTime();
        System.out.print(" s=" + s.climbStairs(n));
        long endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        sm = new Solution_Memoization(); System.out.print(" sm=" + sm.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");



        n = 3;
        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" s=" + s.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        sm = new Solution_Memoization(); System.out.print(" sm=" + sm.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");



        n = 4;
        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" s=" + s.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        sm = new Solution_Memoization(); System.out.print(" sm=" + sm.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");



        n = 11;
        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" s=" + s.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" sh=" + sh.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        sm = new Solution_Memoization(); System.out.print(" sm=" + sm.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");



        n = 12;
        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" s=" + s.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" sh=" + sh.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        sm = new Solution_Memoization(); System.out.print(" sm=" + sm.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");



        n = 13;
        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" s=" + s.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" sh=" + sh.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        sm = new Solution_Memoization(); System.out.print(" sm=" + sm.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");



        n = 40;
        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" s=" + s.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" sh=" + sh.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        sm = new Solution_Memoization(); System.out.print(" sm=" + sm.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");


        n = 45;
        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" s=" + s.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        System.out.print(" sh=" + sh.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");

        System.out.print("n=" + n);
        startTS = System.nanoTime();
        sm = new Solution_Memoization(); System.out.print(" sm=" + sm.climbStairs(n));
        endTS = System.nanoTime();
        System.out.println(" Time=" + (endTS-startTS)/1000 + " micro s");
    }
}
