import java.util.Stack;

public class ReverseLLusingStack {
    Node head; // head of list

    // Linked list Node
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static Node LinkedListReverse(Node head){
        Stack<Integer> valueStack = new Stack<>();

        while(head != null){
            valueStack.push(head.data);
            head = head.next;
        }

        Node reverseList = new Node(Integer.MIN_VALUE);

        Node ptr = reverseList;
        while(!valueStack.isEmpty()){
            ptr.next = new Node(valueStack.pop());
            ptr = ptr.next;
        }

        return reverseList.next;



    }
    

    // Driver code
    public static void main(String[] args) {
        // Start with the empty list.
        ReverseLLusingStack list = new ReverseLLusingStack();

        
    }
}