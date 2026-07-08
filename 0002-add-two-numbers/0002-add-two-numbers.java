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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> s1= new LinkedList<>();
        while(l1!= null){
            s1.add(l1.val);
            l1 = l1.next;
        }
        Queue<Integer> s2= new LinkedList<>();
        while(l2!=null){
            s2.add(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode newHead = null;
        while(!s1.isEmpty()||!s2.isEmpty()||carry!=0){
            int n1 = s1.isEmpty()?0:s1.poll();
            int n2 = s2.isEmpty()?0:s2.poll();
            int tmp = n1+n2+carry;
            ListNode newNode = new ListNode(tmp%10);
            newNode.next=newHead;
            newHead = newNode;
            carry = tmp/10;
        }
        ListNode prev = null;
        ListNode curr = newHead;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }
}