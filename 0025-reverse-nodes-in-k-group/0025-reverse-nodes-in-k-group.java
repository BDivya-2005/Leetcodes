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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1){
            return head;
        }
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode g=d;
        while(true){
            ListNode kth=g;
            for(int i=0;i<k&&kth!=null;i++){
                    kth=kth.next;
            }
            if(kth==null){
                break;
            }
            ListNode gn=kth.next;
            ListNode p=gn;
            ListNode c=g.next;
            while(c!=gn){
                ListNode t=c.next;
                c.next=p;
                p=c;
                c=t;
            }
            ListNode t=g.next;
            g.next=kth;
            g=t;
        }
        return d.next;
    }
}