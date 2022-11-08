public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }
    private void dfs(TreeNode node, StringBuilder sb){
        if(node == null) return;
        else{
            sb.append(node.val).append(",");
            dfs(node.left, sb);
            dfs(node.right, sb);
        }
    }

    public TreeNode deserialize(String data) {
        if(data.trim().length() == 0) return null;
        String[] tokens = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(tokens[0]));
        for(int i = 1; i < tokens.length; i++){
            insert(root, Integer.parseInt(tokens[i]));
        }
        return root;
    }
    private TreeNode insert(TreeNode node, int num){
        if(node == null) return new TreeNode(num);
        else if(num < node.val || node.val == num){
            node.left = insert(node.left, num);
        }else if(num > node.val){
            node.right = insert(node.right, num);
        }
        return node;
    }
}