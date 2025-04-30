/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        ListNode tempu = headB;
        while(temp != tempu){
            if(temp == null){
            temp = headB;
            }
            else{
                temp = temp.next;
            }
            if(tempu == null){
                tempu = headA;
            }
            else{
                tempu = tempu.next;
            }
        }
        return temp;
    }
}