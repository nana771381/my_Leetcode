/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
*/


// Runtime: 0 ms
// Memory Usage: 39.7 MB

class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        int count = 0;
        
        // count how many zeros
        for(int j = 0; j< nums.length; j++){
            if(nums[j] == 0){
                count++;
            }
        }
        
        // bring all the non zeros to the front using two pointers
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                nums[p1] = nums[i];
                p1++;
                
            }
        }
        
        // connect the zeros at the back "count" times
        for(int k = nums.length - count; k < nums.length; k++){
            nums[k] = 0;
        }
        
        
    }
}
