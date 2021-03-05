"""
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.

 

Note: You may assume the string contains only lowercase English letters.
"""

# Runtime: 136 ms
# Memory Usage: 14.5 MB

class Solution:
    def firstUniqChar(self, s: str) -> int:
        if len(s) == 0:
            return -1
        
        if len(s) == 1:
            return 0
        
        my_dict = {}
        
        for char in s:
            if char in my_dict:
                my_dict[char] += 1
            else:
                my_dict[char] = 1
         
        for i, char in enumerate(s):
            if my_dict[char] == 1:
                return i
        
        
        return -1

