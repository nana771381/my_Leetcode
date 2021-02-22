// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.


// Runtime: 15 ms
// Memory Usage: 39.4 MB

// to be improved

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int [2];
        
        int j = 0;
        
        for(int i = 0; i< nums.length; i++){
            if(j == i) {
                continue;
            }
            if(nums[j] + nums[i] == target){
                res[0] = Math.min(j, i);
                res[1] = Math.max(j, i);
            }
            else if (i == nums.length - 1){
                i = -1;
                j++;
            }
        }
        return res;
        
    }
}
