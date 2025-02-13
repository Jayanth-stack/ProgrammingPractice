// Source: LeetCode 86. Partition List

package LinkedList;

public class PartitionList{
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    class Solution {
        public ListNode partionNode(ListNode head, int x){
            ListNode dummy1 = new ListNode(0);
            ListNode dummy2 = new ListNode(0);
            ListNode p1 = dummy1;
            ListNode p2 = dummy2;
            while(head != null){
                if(head.val < x){
                    p1.next = head;
                    p1 = head;
                }else{
                    p2.next = head;
                    p2 = head;
                }
                head = head.next;
            }
            p2.next = null;
            p1.next = dummy2.next;
            return dummy1.next;
        }
    }
}