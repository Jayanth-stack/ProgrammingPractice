
#Leetcode 863. All Nodes Distance K in Binary Tree

class Solution:
    def distanceK(self, root: TreeNode, target: TreeNode, K: int) -> List[int]:
        def dfs(node, parent=None):
            if node:
                node.parent = parent
                dfs(node.left, node)
                dfs(node.right, node)
        dfs(root)
        
        q = deque([(target, 0)])
        seen = {target}
        while q:
            if q[0][1] == K:
                return [node.val for node, d in q]
            node, d = q.popleft()
            for nei in (node.left, node.right, node.parent):
                if nei and nei not in seen:
                    seen.add(nei)
                    q.append((nei, d+1))
        return []
