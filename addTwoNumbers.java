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
class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int carry =0;

        while (l1!=null || l2!=null || carry!=0){
            int x=0;
            int y=0;

            if(l1 != null){
                x = l1.val;
                l1 = l1.next;
            } 
            if(l2 != null){
                y = l2.val;
                l2 = l2.next;
            }

            int sum = x + y + carry;
            carry = sum / 10;
            int digit = sum % 10;
            
            curr.next = new ListNode(digit);
            curr = curr.next;

            
        }
        return res.next;

    }
}

// Time Complexity: O(max(n,m))