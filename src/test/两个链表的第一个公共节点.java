package test;
/**
 * 
 * @author 233admincol
 *输入两个链表，找出它们的第一个公共结点。
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class 两个链表的第一个公共节点 {
	/*
	 * 虽然两个链表的长度还不知道，但是我们只需要保证两个链节点同时到达尾节点或相同的节点就好
	 *
	 */
	public ListNode FindFirstCommonNode( ListNode pHead1, ListNode pHead2) {
	        ListNode p1 = pHead1;
	        ListNode p2 = pHead2;
	        //关键信息，我们知道的一点是公共节点所处位置的的两个链表的下标是相同的。
	        while(p1!=p2){
	            p1 = (p1==null ? pHead2 : p1.next);
	            p2 = (p2==null ? pHead1 : p2.next);
	        }
	        return p1;
	    }
}
