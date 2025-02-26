// Leetcode 146 LRU Cache
// Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.


package DSA.Leetcode.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class LRUcache {
    public class Node{
        int key;
        int value;
        Node next;
        Node prev;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public class DoublyLinkedList{
        Node head;
        Node tail;
        int size;
        public DoublyLinkedList(){
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }
        public void addFirst(Node node){
            Node temp = head.next;
            head.next = node;
            node.prev = head;
            node.next = temp;
            temp.prev = node;
            size++;
        }
        public void remove(Node node){
            Node prev = node.prev;
            Node next = node.next;
            prev.next = next;
            next.prev = prev;
            size--;
        }
        public Node removeLast(){
            Node last = tail.prev;
            remove(last);
            return last;
        }

    }
    int capacity;
    Map<Integer, Node> map;
    DoublyLinkedList list;
    public LRUcache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        list = new DoublyLinkedList();
    }
    public int get(int key){
        if (!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        list.remove(node);
        list.addFirst(node);
        return node.value;
    }
    public void put(int key, int value){
        if (map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            list.remove(node);
            list.addFirst(node);
        }else{
            if (list.size == capacity){
                Node last = list.removeLast();
                map.remove(last.key);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            list.addFirst(node);
        }
    }


}
