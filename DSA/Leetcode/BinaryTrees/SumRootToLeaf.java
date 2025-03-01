//Leetcode 129
// Level: Medium

package DSA.Leetcode.BinaryTrees;

public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        return depthFirstSearch(root, 0);
    }
    public int depthFirstSearch(TreeNode root, int sum){
        if(root == null) return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null) return sum;
        return depthFirstSearch(root.left, sum) + depthFirstSearch(root.right, sum);
    }
}
