/*
 * @lc app=leetcode id=2058 lang=java
 *
 * [2058] Find the Minimum and Maximum Number of Nodes Between Critical Points
 */

// @lc code=start
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
    public int[] nodesBetweenCriticalPoints(ListNode h) {
        int first=-1, last=-1, min=Integer.MAX_VALUE, i=1;
        ListNode p=h, c=h.next;
        while(c.next!=null){
            if((c.val>p.val&&c.val>c.next.val)||(c.val<p.val&&c.val<c.next.val)){
                if(first<0) first=i; else min=Math.min(min,i-last);
                last=i;
            }
            p=c; c=c.next; i++;
        }
        return first==last ? new int[]{-1,-1} : new int[]{min,last-first};
    }
}
// @lc code=end

