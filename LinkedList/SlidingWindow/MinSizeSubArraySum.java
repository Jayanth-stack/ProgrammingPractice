//leetcode 209 Minimum Size Subarray Sum

package LinkedList.SlidingWindow;

class Solution{
    public int minSubArrayLen(int s, int[] nums){
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            while(sum >= s){
                minLen = Math.min(minLen, i - left + 1);
                sum -= nums[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}