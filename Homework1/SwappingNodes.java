/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        Node insertNode = new Node(insertVal);
        if(head == null){
            insertNode.next = insertNode;
            return insertNode;
        }

        Node curret = head;

        while(curret.next != head){
            int currentVal = curret.val, nextVal = curret.next.val;
            if(currentVal > nextVal){
                if(currentVal < insertVal && nextVal < insertVal){
                    break;
                }
                if(currentVal > insertVal && nextVal > insertVal){
                    break;
                }
            }
            if(currentVal <= insertVal && insertVal <= nextVal){
                break;
            }
            curret = curret.next;
        }

        Node nex = curret.next;
        curret.next = insertNode;
        insertNode.next = nex;
        return head;
    }
}