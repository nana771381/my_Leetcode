/*
Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

 

Constraints:

    1 <= s.length <= 2 * 105
    s consists only of printable ASCII characters.

*/

// Runtime: 25 ms
// Memory Usage: 39.5 MB

// two pointers
class Solution {
    public boolean isPalindrome(String s) {
      
        // remove punctuations and make s lower case
        String res = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    
        int n = res.length() -1;
        
        for(int i = 0; i < res.length()/2; i++){
            if(res.charAt(i) != res.charAt(n-i)) return false;
        }
        return true;
    }
}
