import java.util.List;

public class ReverseLL{

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
        ListNode(int x, ListNode next){
            val = x;
            this.next = next;
        }
    }

    public ListNode reverseLinkedList(ListNode head){
        if(head ==null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
    
        while (curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        head = prev;

        return head;
    }
}