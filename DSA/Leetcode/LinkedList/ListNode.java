//Leetcode 82. Remove Duplicates from Sorted List II

package DSA.Leetcode.LinkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class solution{
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.next.val == current.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
}