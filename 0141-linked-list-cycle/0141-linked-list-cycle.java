/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode>v=new HashSet<>();
        ListNode cur=head;
        while(cur!=null){
            if(!v.add(cur)){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
}