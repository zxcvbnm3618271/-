package test;
/**
 * 
 * @author 233admincol
 *��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null��
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
/*
 * ��һ�����һ������㡣�ֱ���p1��p2ָ������ͷ����p1ÿ����һ����p2ÿ���߶�����ֱ��p1==p2�ҵ��ڻ��е����㡣
�ڶ������һ�����ڡ�
���ϲ�����p1==p2ʱ��p2�������ڵ���Ϊ2x,p1�������ڵ���Ϊx,�軷����n���ڵ�,p2��p1����һȦ��2x=n+x; n=x;
���Կ���p1ʵ������һ�����Ĳ���������p2ָ������ͷ����p1λ�ò��䣬p1,p2ÿ����һ��ֱ��p1==p2;
 ��ʱp1ָ�򻷵���ڡ�
 */
public class �����л�����ڽڵ� {
	 ListNode EntryNodeOfLoop(ListNode pHead){
	        if(pHead == null || pHead.next == null)
	            return null;
	        ListNode p1 = pHead;
	        ListNode p2 = pHead;
	        while(p2 != null && p2.next != null ){
	            p1 = p1.next;
	            p2 = p2.next.next;
	            if(p1 == p2){
	                p2 = pHead;
	                while(p1 != p2){
	                    p1 = p1.next;
	                    p2 = p2.next;
	                }
	                if(p1 == p2)
	                    return p1;
	            }
	        }
	        return null;
	    }
}
