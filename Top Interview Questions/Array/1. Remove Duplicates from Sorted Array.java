// Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        
        int i = 0;
        
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i+1;
    }
}

// Runtime: 0 ms
// Memory Usage: 40.7 MB
