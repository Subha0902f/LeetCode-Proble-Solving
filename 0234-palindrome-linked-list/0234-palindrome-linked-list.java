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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Skip the middle node for odd-length lists
        if (fast != null) {
            slow = slow.next;
        }

        // Reverse the second half
        ListNode second = slow;
        ListNode prev = null;

        while (second != null) {
            ListNode newNode = second.next;
            second.next = prev;
            prev = second;
            second = newNode;
        }

        // Compare both halves
        ListNode first = head;
        ListNode last = prev;

        while (last != null) {
            if (first.val != last.val) {
                return false;
            }

            first = first.next;
            last = last.next;
        }

        return true;
    }
}