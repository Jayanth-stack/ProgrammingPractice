# Problem: Minimum Operations to Make Array Unique
# Leetcode 2357 
class Solution:
    def minOperations(self, nums:List[int]) -> int:
        nums_set = set(nums)
        return len(nums_set) - (0 in nums_set )
    
# Time Complexity: O(N)
# Space Complexity: O(N)

# Approach: Using Set