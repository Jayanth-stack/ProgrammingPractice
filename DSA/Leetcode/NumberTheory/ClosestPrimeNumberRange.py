#Leetcode 2523: Closest Prime Number Range
# Given a number n, find the closest prime number in the range [n-10, n+10]

from typing import List

def isPrime(self, right:int, left:int) -> List[int]:
    primes = []
    for i in range(right, left+1):
        if i == 1:
            continue
        if i == 2:
            primes.append(i)
            continue
        if i % 2 == 0:
            continue
        flag = 0
        for j in range(3, int(i**0.5)+1, 2):
            if i % j == 0:
                flag = 1
                break
        if flag == 0:
            primes.append(i)
    return primes