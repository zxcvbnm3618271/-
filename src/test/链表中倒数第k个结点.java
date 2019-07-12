package test;
/**
 * 
 * @author 233admincol
 *输入一个链表，输出该链表中倒数第k个结点
 */

public class 链表中倒数第k个结点 {
	public ListNode FindKthToTail(ListNode head,int k) {
		//避免空链表查询
		if (head == null)   return head;
		 //将头节点赋予当前节点
        ListNode node = head;
        //标记当前节点所处链表位置
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        //如果当前链表长度小于K，则拒绝查询
        if (count < k)  return null;
        //再次记录头节点，从新遍历找出查询的节点
        ListNode p = head;
        for (int i = 0; i < count - k; i++) {
            p = p.next;
        }
         
        return p;
    }
}
