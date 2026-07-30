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
    
    private int maxDia = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        findHeight(root);
        return maxDia;
    }

    private int findHeight(TreeNode root){
        if(root == null) return 0;

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        maxDia = Math.max(maxDia, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);

    }
}