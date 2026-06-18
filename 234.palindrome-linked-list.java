
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */
// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {

    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> a_list = new ArrayList<>();

        while (head != null) {

            a_list.add(head.val);
            head = head.next;

        }

        int left = 0;

        int right = a_list.size() - 1;

        while (left < right) {

            if (!a_list.get(left).equals(a_list.get(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
// @lc code=end

