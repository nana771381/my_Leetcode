/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

Example 3:

Input: haystack = "", needle = ""
Output: 0

 

Constraints:

    0 <= haystack.length, needle.length <= 5 * 104
    haystack and needle consist of only lower-case English characters.

*/

// Runtime: 2 ms
// Memory Usage: 37.9 MB

class Solution {
    public int strStr(String haystack, String needle) {
        
        // handle empty cases
        if(needle.isEmpty() || haystack.isEmpty()){
            return (needle.isEmpty())? 0: -1;
        }
        
        // if haystack's length is shorter than needle's length, return not found
        for(int i = 0; i < haystack.length(); i++ ){
            if(i + needle.length() > haystack.length()){
                break;
            }
            
            for(int j = 0; j < needle.length(); j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
                if(j == needle.length() -1){
                    return i;
                }
            }
            
            
        }
        
        
        return -1;
    }
}
