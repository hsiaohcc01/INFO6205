class BSTIterator {
    Queue<Integer> q = new LinkedList<>();
    public BSTIterator(TreeNode root) {
        inOrder(root);
    }

    public int next() {
        return q.poll();
    }

    public boolean hasNext() {
        return (!q.isEmpty());
    }

    public void inOrder(TreeNode root)
    {
        if(root != null)
        {
            inOrder(root.left);
            q.add(root.val);
            inOrder(root.right);
        }
    }
}