"""
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

"""

# Runtime: 52 ms
# Memory Usage: 19.8 MB


class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = ''.join(ch.lower() for ch in s if ch.isalnum()) # remove punctuation marks and space 
        
        if len(s) == 1:
            return True
  
        n = len(s) -1
        
      # two pointers
        for i in range(0, len(s)//2):
            j = n - i
            
            if s[i] != s[j]:
                return False
        
        return True
