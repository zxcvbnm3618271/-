package test;
/**
 * 
 * @author 233admincol
 *�������������ҳ����ǵĵ�һ��������㡣
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ��������ĵ�һ�������ڵ� {
	/*
	 * ��Ȼ��������ĳ��Ȼ���֪������������ֻ��Ҫ��֤�������ڵ�ͬʱ����β�ڵ����ͬ�Ľڵ�ͺ�
	 *
	 */
	public ListNode FindFirstCommonNode( ListNode pHead1, ListNode pHead2) {
	        ListNode p1 = pHead1;
	        ListNode p2 = pHead2;
	        //�ؼ���Ϣ������֪����һ���ǹ����ڵ�����λ�õĵ�����������±�����ͬ�ġ�
	        while(p1!=p2){
	            p1 = (p1==null ? pHead2 : p1.next);
	            p2 = (p2==null ? pHead1 : p2.next);
	        }
	        return p1;
	    }
}
