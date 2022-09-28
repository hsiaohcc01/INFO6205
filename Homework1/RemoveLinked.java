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
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
            head = head.next;
        ListNode point = head;
        while(point != null && point.next != null)
            if(point.next.val == val){
                point.next = point.next.next;
            }else{
                point = point.next;
            }
        return head;
    }
}