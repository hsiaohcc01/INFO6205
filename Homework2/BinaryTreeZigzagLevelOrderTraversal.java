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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> subList = new LinkedList<Integer>();

            for(int i=0; i<size; i++){
                TreeNode top = queue.poll();

                if(top.left != null) queue.add(top.left);

                if(top.right != null) queue.add(top.right);

                if(result.size() % 2 == 0) subList.addLast(top.val);
                else subList.addFirst(top.val);
            }
            result.add(subList);
        }
        return result;
    }
}