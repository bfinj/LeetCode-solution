/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 *
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/description/
 *
 * algorithms
 * Easy (48.79%)
 * Likes:    270
 * Dislikes: 0
 * Total Accepted:    80.7K
 * Total Submissions: 163.3K
 * Testcase Example:  '[1,1,2]'
 *
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * 
 * 示例 1:
 * 
 * 输入: 1->1->2
 * 输出: 1->2
 * 
 * 
 * 示例 2:
 * 
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = head;
        ListNode q = p.next;
        while(q!=null){
            if(p.val == q.val){
                p.next = q.next;
                q = p.next;
            }
            else{
                p = p.next;
                q = q.next;
            }
        }
        return dummy.next;
    }
}
// @lc code=end

