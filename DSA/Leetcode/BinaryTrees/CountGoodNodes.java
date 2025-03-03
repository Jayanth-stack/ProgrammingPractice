//Leetcode 1448. Count Good Nodes in Binary Tree
package DSA.Leetcode.BinaryTrees;

public class CountGoodNodes {
    private int goodNodesCount =0;
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        dfs(root, Integer.MIN_VALUE);
        return goodNodesCount;
    }
    public void dfs(TreeNode root, int max){
        if (root == null) return;
        if (root.val >= max) {
            goodNodesCount++;
            max = root.val;
        }
        dfs(root.left, max);
        dfs(root.right, max);
    }
}
