class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new LinkedList<>();

        if(root == null) return result;

        queue.add(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            ArrayList<Integer> sublist = new ArrayList<>();

            for(int i = 0; i < level; i++){
                TreeNode node = queue.poll();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                sublist.add(node.val);
            }
            result.add(sublist);
        }
        return result;
    }
}