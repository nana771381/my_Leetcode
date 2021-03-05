/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21

Example 4:

Input: x = 0
Output: 0

 

Constraints:

    -231 <= x <= 231 - 1


*/

// Runtime: 1 ms
// Memory Usage: 35.6 MB

class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while(x != 0){
            // take the last digit
            int pop = x % 10;
          
            // left the front digits
            x = x / 10;
            
            // rev is becoming bigger and bigger each loop so it may overflow
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)) return 0;
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)) return 0;
            
            rev = rev * 10 + pop;
                
        }
        return rev;
        
    }
}
