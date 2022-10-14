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
public class Solution {
    public List<List<Integer>> findLeaves(TreeNode root) {

        List<List<Integer>> leavesList = new ArrayList< List<Integer>>();
        List<Integer> leaves = new ArrayList<Integer>();

        while(root != null) {
            if(isLeave(root, leaves)) root = null;
            leavesList.add(leaves);
            leaves = new ArrayList<Integer>();
        }
        return leavesList;
    }

    public boolean isLeave(TreeNode node, List<Integer> leaves) {

        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return true;
        }

        if (node.left != null) {
            if(isLeave(node.left, leaves))  node.left = null;
        }

        if (node.right != null) {
            if(isLeave(node.right, leaves)) node.right = null;
        }

        return false;
    }
}