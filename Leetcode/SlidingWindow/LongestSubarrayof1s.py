# Longest Subarray of 1's After Deleting One Element
# Leetcode #1493
from typing import List

class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        # Initialize the left pointer of the window
        left = 0
                # Initialize the count of zeroes in the current window
        zeroes = 0
                # Initialize the answer to store the maximum length of subarray
        ans = 0

                # Get the length of the input array
        n = len(nums)

                # Iterate over the array with the right pointer
        for right in range(n):
                    # If the current element is zero, increment the zeroes count
            if nums[right] == 0:
                        zeroes += 1

                    # If there are more than one zero in the current window, shrink the window from the left
            while zeroes > 1:
                        # If the element at the left pointer is zero, decrement the zeroes count
                if nums[left] == 0:
                    zeroes -= 1
                        # Move the left pointer to the right
                left += 1

                    # Update the answer with the maximum length of the subarray found so far
            ans = max(ans, right - left + 1 - zeroes)

                # If the answer is equal to the length of the array, it means there were no zeroes to remove, so return ans - 1
                # Otherwise, return the answer as it is
        return ans - 1 if ans == n else ans