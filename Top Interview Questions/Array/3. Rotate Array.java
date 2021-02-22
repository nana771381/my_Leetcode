// Given an array, rotate the array to the right by k steps, where k is non-negative.

// Runtime: 1 ms
// Memory Usage: 39.2 MB

class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        if (nums.length==1) return;
        
        int diff = nums.length - k;
        int [] front = new int [diff];
        int [] back = new int [k];
        int count = 0;
        
        for(int i = 0; i < diff; i++){
            front[i] = nums[i];
        }
        
        for(int j = diff; j < nums.length; j++){
            back[count] = nums[j];
            count++;
        }
        int count1 = 0;
        
        for(int t = 0; t < nums.length; t++){
            if(t < k){
                nums[t] = back[t];
            }
            else{
                nums[t] = front[count1];
                count1++;
            }
        }
        
        
    }   
    
}
