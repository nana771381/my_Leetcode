"""
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
"""

# Runtime: 52 ms
# Memory Usage: 14.6 MB

def isAnagram(self, s: str, t: str) -> bool:
        my_dict = {}
        
      # valid anagram s and t must have same length
        if len(s) != len(t):
            return False
        
        # add characters in s into dictionary
        for char in s:
            if char not in my_dict:
                my_dict[char] = 1
            else:
                my_dict[char] += 1
        
        # deduct the value of the characters in t from the dictionary
        for char in t:
            if char in my_dict:
                my_dict[char] -=1
            else:
                return False
        
        # all values of the characters must be 0 to be a valid anagram
        for count in my_dict.values():
            if count != 0:
                return False
        
        return True
            
