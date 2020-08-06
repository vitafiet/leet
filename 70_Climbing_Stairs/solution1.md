The goal here is to find different ways of reaching step `n`.

Lets look at how we can reach steps 1 through 4 and see if a pattern emerges.

**Step #1:** There is just one way, you go from where you are standing to step `#1`. \
Ways to climb : \
*0->1*

**Step #2:** Now if you are on the ground, you can directly step to step `#2` or if you are on step `#1`, you can climb one step to step `#2`. \
Ways to climb : \
*0->1->1 \
0->2*

**Step #3:** To reach step `#3`, you have to be on either step `#1` or step `#2`. You can reach step `#3` by taking 1 step from step `#2` or 2 steps from step `#3`. \
Ways to climb: \
(Ways to get to step #2 plus 1 step) \
*0->1->1->1 \
0-->2->1* \
(Way to get to step #1 plus 2 step) \
*0->1->2*

**Step #4:** To reach step `#4`, you have to be either on step `#2` or step `#3`. You can take 2 steps from `#2` or 1 step twice from `#2` and 1 step from `#3`. \
Ways to climb: \
(Ways to get to step #3 plus 1 step) \
*0->1->1->1->1 \
0->2->1->1 \
0->1->2->1* \
(Ways to get to step #2 plus 2 steps) \
*0->1->1->2 \
0->2->2*

A pattern emerges, this seems to boil down to a simple fibonacci sequence which can be solved recursively or using `memoization`. Below is a memo based solution.
```
public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
```