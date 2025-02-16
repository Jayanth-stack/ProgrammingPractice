## Problem: Daily Temperatures
## Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.
## Leetcode 739: https://leetcode.com/problems/daily-temperatures/
from typing import List

class DailyTemperatures:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack: List[int] = []
        result: List[int] = [0] * len(temperatures)
        
        for current_day, current_temp in enumerate(temperatures):
            # Check if the current temperature is higher than the temperature at the index stored in the stack
            while stack and temperatures[stack[-1]] < current_temp:
                previous_day = stack.pop()
                result[previous_day] = current_day - previous_day
            stack.append(current_day)
        
        return result