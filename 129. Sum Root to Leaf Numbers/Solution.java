/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
 class Solution {

    public int helper(TreeNode node, int num) {
        if (node == null) return 0;

        if (node.left == null && node.right == null) {
            num = num*10 + node.val;
            return num;
        }

        return helper(node.left, num*10 + node.val) + helper(node.right, num*10 + node.val);
    }

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
}