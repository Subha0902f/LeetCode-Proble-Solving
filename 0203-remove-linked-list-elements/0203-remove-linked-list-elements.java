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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
          return head;
        }
        while(head!=null && val == head.val){
            head = head.next;
        }
        if(head==null){
          return head;
        }
         ListNode current=head.next;
        ListNode prev=head;
        while(current!=null){
            if(val == current.val){
              prev.next = current.next;
              current = prev.next;
              continue;
            }
            prev = prev.next;
            current = current.next;
        }
        return head;
    }
}