# LeetCode 练习
## 1. Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 
### Example:
 
Given nums = [2, 7, 11, 15], target = 9,
 
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

### Solutions
#### Approach #1  (Brute Force) [Accepted]
Time complexity : O(n^2)  
Space complexity : O(1)

```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++){
                if (nums[i] == target - nums[j])
                    return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("Error");
    }
}
```

#### Approach #2 使用  Hash Table

----
## 7. Reverse Integer
Given a 32-bit signed integer, reverse digits of an integer.
### Example

```
Example 1:

Input: 123
Output: 321
```
```
Example 2:

Input: -123
Output: -321
```
```
Example 3:

Input: 120
Output: 21
```

### Solutions
