// Rotate a linked list to the right by k places
// Given a linked list, rotate the list to the right by k places, where k is non-negative.
package Leetcode.LinkedList;

public class RotateLinkedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int length = 1;
        ListNode current = head;
        while(current.next != null){
            current = current.next;
            length++;
        }
        current.next = head;
        k = k % length;
        k = length - k;
        while(k-- > 0){
            current = current.next;
        }
        head = current.next;
        current.next = null;
        return head;
    }
}
