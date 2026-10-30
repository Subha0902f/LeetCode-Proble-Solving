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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head==null) {
        return head;
       }
       ListNode count=head;
       int length=1;
       while(count.next!=null){
        count=count.next;
        length++;
       }

        if (n == length) {
            return head.next;
        }
       n = length-n;
       ListNode current=head;
       for(int i=1;i<n;i++){
        current = current.next;
       }
       current.next=current.next.next;
       return head;
    }
}