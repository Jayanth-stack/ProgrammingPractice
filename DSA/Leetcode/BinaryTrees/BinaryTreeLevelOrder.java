// Level: Medium
// Binary Tree Level Order Traversal - LeetCode 102

package DSA.Leetcode.BinaryTrees;
import java.util.*;
public class BinaryTreeLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode current = queue.remove();
                currentLevel.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            result.add(currentLevel);
        }
        return result;
    }
}
