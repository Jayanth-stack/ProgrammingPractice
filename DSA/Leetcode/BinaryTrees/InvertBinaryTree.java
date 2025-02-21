// Invert a binary tree.
// Leetcode 226. Invert Binary Tree
// https://leetcode.com/problems/invert-binary-tree/

package DSA.Leetcode.BinaryTrees;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
