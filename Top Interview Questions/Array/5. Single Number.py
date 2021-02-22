# Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
# Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?


# Runtime: 132 ms
# Memory Usage: 16.8 MB

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        count = {}
        for elm in nums:
            if not elm in count:
                count[elm] = 1
            else:
                count[elm] += 1
        return min(count, key=count.get)
