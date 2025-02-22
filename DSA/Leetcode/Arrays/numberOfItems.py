#Problem: Number of Items
# Difficulty: Medium
# Approach: Prefix Sum 
## Problem Link: https://leetcode.com/discuss/interview-question/1129329/Amazon-OA-or-Number-of-Items

class Solution:
    def numberOfItems(self, s: str, startIndices: List[int], endIndices: List[int]) -> List[int]:
        n = len(s)

        prefix_sum = [0] * (n+1)
        left_pipe = [-1] * n
        right_pipe = [-1] * n

        last_pipe = -1
        for i in range(n):
            if s[i] == '|':
                last_pipe = i
            left_pipe[i] = last_pipe
        
        last_pipe = -1
        for i in range(n-1, -1, -1):
            if s[i] == '|':
                last_pipe = i
            right_pipe[i] = last_pipe

        
        count = 0
        for i in range(n):
            if s[i] == '*':
                count += 1
            prefix_sum[i+1] = count

        result = []

        for start, end in zip(startIndices, endIndices):
            start -= 1
            end -= 1

            if left_pipe[start] == -1 or right_pipe[end] == -1:
                result.append(0)
            else:
                result.append(prefix_sum[right_pipe[end]] - prefix_sum[left_pipe[start]])
            
        return result
       