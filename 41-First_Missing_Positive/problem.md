# 41 - First Missing Positive

Given an unsorted integer array `nums`, find the smallest missing positive integer.

**Follow up**: Could you implement an algorithm that runs in `O(n)` time and uses constant extra space?


### Example 1:
```
Input: nums = [1,2,0]
Output: 3
```
### Example 2:
```
Input: nums = [3,4,-1,1]
Output: 2
```
### Example 3:
```
Input: nums = [7,8,9,11,12]
Output: 1
```

### Constraints:

* `0 <= nums.length <= 300`
* `-231 <= nums[i] <= 231 - 1`


**Hint-1:** Think about how you would solve the problem in non-constant space. Can you apply that logic to the existing space? \
**Hint-2:** We don't care about duplicates or non-positive integers. \
**Hint-3:** Remember that O(2n) = O(n)