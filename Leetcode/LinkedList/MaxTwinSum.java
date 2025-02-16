// You are given a singly linked list head as input. 
//Return the maximum possible sum of twin nodes in the linked list. 
//A twin node is defined as two nodes in the linked list that are at the same distance from the head and whose sum is maximum among all such pairs. If there are no twin nodes in the linked list, return 0.
// Leetcode 2130. Max Twin Sum

package Leetcode.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class MaxTwinSum {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public class Solution{
        public int maxTwinSum (ListNode head){
            List<Integer> list = new ArrayList<>();
            ListNode currentNode = head;

            while(currentNode != null){
                list.add(currentNode.val);
                currentNode = currentNode.next;
            }
            int n = list.size();
            int maxSum = 0;

            for(int i=0; i<n/2; i++){
                int twinIndex = n - i - 1;
                int sum = list.get(i) + list.get(twinIndex);
                maxSum = Math.max(maxSum, sum);
            }

            return maxSum;
        }
    }
}
