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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int length = 0;
        for(ListNode node = head; node != null; node = node.next){
            length++;
        }
        int size = length/k;
        int extra = length%k;
        ListNode node = head;
        ListNode prev = null;
        for(int i = 0; i<k; i++, extra--){
            ans[i] = head;
            int partlength = size + ((extra>0 ? 1:0));
            for (int j = 0; j< partlength; j++){
                prev = head;
                head = head.next;
            }
            if (prev != null){
                prev.next = null;
            }
        }
        return ans;
    }
}