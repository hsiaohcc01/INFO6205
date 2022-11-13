class FindRange {
    static class Node {
        int val;
        Node right, left;

        Node(int number) {
            this.val = number;
            right = left = null;
        }
    }

    ;

    static void findQ3(Node root, int val1, int val2) {

        if (root == null) return;

        if (val1 < root.val) {
            findQ3(root.left, val1, val2);
        }

        if (val1 <= root.val && val2 >= root.val) {
            System.out.print(root.val);
        }

        if (val2 > root.val) {
            findQ3(root.right, val1, val2);
        }
    }

    public static void main(String[] args) {
        int val1 = 5;
        int val2 = 15;
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(12);
        root.left.left = new Node(13);
        root.right.right = new Node(14);
        findQ3(root, val1, val2);
    }
}
