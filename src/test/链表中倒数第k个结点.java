package test;
/**
 * 
 * @author 233admincol
 *����һ����������������е�����k�����
 */

public class �����е�����k����� {
	public ListNode FindKthToTail(ListNode head,int k) {
		//����������ѯ
		if (head == null)   return head;
		 //��ͷ�ڵ㸳�赱ǰ�ڵ�
        ListNode node = head;
        //��ǵ�ǰ�ڵ���������λ��
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        //�����ǰ������С��K����ܾ���ѯ
        if (count < k)  return null;
        //�ٴμ�¼ͷ�ڵ㣬���±����ҳ���ѯ�Ľڵ�
        ListNode p = head;
        for (int i = 0; i < count - k; i++) {
            p = p.next;
        }
         
        return p;
    }
}
