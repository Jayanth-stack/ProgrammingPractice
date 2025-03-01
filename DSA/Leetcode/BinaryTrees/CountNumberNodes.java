// Count the number of nodes in a complete binary tree
//Leetcode 222. Count Complete Tree Nodes
package DSA.Leetcode.BinaryTrees;

public class CountNumberNodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
