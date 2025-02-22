#Leetcode 138. Copy List with Random Pointer

class Solution:
    def copyRandomList(self, head: 'Node') -> 'Node':
        oldToCopy = {None : None}

        cur = head
        while cur:
            oldToCopy[cur] = Node(cur.val)
            cur = cur.next
        

        cur = head
        while cur:
            copy = oldToCopy[cur]
            copy.next = oldToCopy[cur.next]
            copy.random = oldToCopy[cur.random]
            cur = cur.next
        

        return oldToCopy[head]