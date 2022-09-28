/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;

        ListNode current = head;
        int size = 1;

        while (current.next != null) {
            current = current.next;
            size++;
        }

        k = k% size;
        if (k == 0)
            return head;

        ListNode kthNode = head;
        for(int i = 0; i< size-k-1; i++){
            kthNode = kthNode.next;
        }

        current.next = head;
        head = kthNode.next;
        kthNode.next = null;
        return head;
    }
}