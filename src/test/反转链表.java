package test;
/**
 * ����һ��������ת��������������ı�ͷ
 * @author 233admincol
 *
 */

public class ��ת���� {
	public ListNode ReverseList(ListNode head) {
		   if(head==null)
	            return null;
	        //headΪ��ǰ�ڵ㣬�����ǰ�ڵ�Ϊ�յĻ����Ǿ�ʲôҲ������ֱ�ӷ���null��
	        ListNode pre = null;
	        ListNode next = null;
	        //��ǰ�ڵ���head��preΪ��ǰ�ڵ��ǰһ�ڵ㣬nextΪ��ǰ�ڵ����һ�ڵ�
	        //��Ҫpre��next��Ŀ�����õ�ǰ�ڵ��pre->head->next1->next2���pre<-head 
	        //next1->next2
	        //��pre�ýڵ���Է�ת��ָ���򣬵���ת֮���������next�ڵ㱣��next1�ڵ�Ļ����˵�����ʹ˶Ͽ���
	        //������Ҫ�õ�pre��next�����ڵ�
	        //1->2->3->4->5
	        //1<-2<-3 4->5
	        while(head!=null){
	            //��ѭ���������ǰ�ڵ㲻Ϊ�յĻ���ʼ��ִ�д�ѭ������ѭ����Ŀ�ľ����õ�ǰ�ڵ��ָ��next��ָ��pre
	            //��˾Ϳ���������ת�����Ч��
	            //����next����head����һ���ڵ����Ϣ����֤����������Ϊʧȥhead�ڵ��ԭnext�ڵ���ʹ˶���
	            next = head.next;
	            //������next���Ϳ�����head��ָ��next���ָ��pre�ˣ���������
	            head.next = pre;
	            //headָ��pre�󣬾ͼ������η�ת��һ���ڵ�
	            //��pre��head��next��������ƶ�һ���ڵ㣬������һ�ε�ָ�뷴ת
	            pre = head;
	            head = next;
	        }
	        //���headΪnull��ʱ��pre��Ϊ���һ���ڵ��ˣ����������Ѿ���ת��ϣ�pre���Ƿ�ת������ĵ�һ���ڵ�
	        //ֱ�����pre����������Ҫ�õ��ķ�ת�������
	        return pre;
    }
}
