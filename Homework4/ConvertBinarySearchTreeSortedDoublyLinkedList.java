class Solution {
    Node prev;
    public Node treeToDoublyList(Node root) {
        if (root == null)
            return null;
        prev = new Node(0, null, null);
        Node temp = prev;
        helper(root);
        prev.right = temp.right;
        temp.right.left = prev;
        return temp.right;
    }

    private void helper(Node root){
        if (root == null)
            return;
        helper(root.left);
        prev.right = root;
        root.left = prev;
        prev = root;
        helper(root.right);
    }
}