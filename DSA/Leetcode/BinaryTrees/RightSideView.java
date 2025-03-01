//Leetcode 199
// Level: Medium
package DSA.Leetcode.BinaryTrees;
import java.util.*;
public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode current = queue.poll();
                if(i == size - 1) result.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
        }
        return result;
    }
}
