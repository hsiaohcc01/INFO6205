class FindParent
{
    static class Node
    {
        int number;
        Node LN, RN;
        Node(int number)
        {
            this.number = number;
            LN = RN = null;
        }
    };

    static void find(Node node, int val, int parent)
    {
        if (node == null)
            return;

        if (node.number == val) {
            System.out.print(parent);
        }
        else {
            find(node.LN, val, node.number);
            find(node.RN, val, node.number);
        }
    }

    public static void main(String []args)
    {
        Node root = new Node(1);
        root.LN = new Node(3);
        root.RN = new Node(5);
        root.LN.LN = new Node(7);
        root.RN.RN = new Node(9);
        int node = 3;

        find(root, node, -1);
    }
}
