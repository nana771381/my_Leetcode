/*
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Example 3:

Input: digits = [0]
Output: [1]

Constraints:

    1 <= digits.length <= 100
    0 <= digits[i] <= 9
*/



// Runtime: 0 ms
// Memory Usage: 37.7 MB




class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // iterate from the back to the front
        for(int i = n - 1; i >= 0; i--){
        
            // if last digit is less than 9, return the digit with the last digit + 1
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            
            // else, if nothing returned, last digit must be 9, so make it 0 and iterate to the second last integer and so on
            digits[i] = 0;
        }
        
        // if done iterate all the digits but nothing is returned and reach here, must be all digits is 9
        // and prev line we turned all the 9s to 0s
        // so we create a new array with that is one unit longer than the digits array
        int [] new_digits = new int [n + 1];
        
        // in java, all ints in the array are initialised to 0
        
        // eg. [9, 9, 9], return [1, 0, 0, 0]
        new_digits[0] = 1;
        return new_digits;
        
        
    }
}
