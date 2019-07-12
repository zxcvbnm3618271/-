package test;

import com.sun.org.apache.xalan.internal.xsltc.dom.ClonedNodeListIterator;


//���ڵ�
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class ��������ĸ��� {
	//���ڵ㸴�ƺ��������ظ�����ͷ
	 public RandomListNode Clone(RandomListNode pHead)
	    {
		 /*
		 *����˼·��
		 *1��������������ÿ����㣬�縴�ƽ��A�õ�A1�������A1�嵽���A���棻
		 *2�����±������������Ͻ������ָ����½�㣬��A1.random = A.random.next;
		 *3�����������������Ϊԭ����͸��ƺ������
		 */
		 
		 if (pHead==null) {
			return null;
		}
		
		 //����ÿһ���ڵ㣬�縴��A�õ�A1�����ڵ�A1�嵽A����
		 //��ǰ�ڵ�
		 RandomListNode currentNode=pHead;
		 while(currentNode !=null) {
			 //���浱ǰ�ڵ��ֵ
			 RandomListNode cloneNode=new RandomListNode(currentNode.label);
			 //���浱ǰ�ڵ�ָ�����һ�ڵ�
			 RandomListNode nextNode = currentNode.next;
			 //����¡�ڵ��������
			 currentNode.next=cloneNode;
			 //����¡�ڵ��nextָ����һ��ԭ�ڵ�
			 cloneNode.next = nextNode;
			 //���Ͻڵ�����ָ�����¡�ڵ㣬A1.random=A.random.next
			 currentNode.next.random=currentNode.random==null?null:currentNode.random.next;
			 //��ǰ�ڵ��Ƶ�ԭ��һ�ڵ�
			 currentNode=nextNode;
		 }
		 
		 //���������������Ϊԭ����͸��ƺ������
		 currentNode=pHead;
		 //��¼��¡�����ͷ�ڵ�
		 RandomListNode pCloneNode = currentNode.next;
		 while(currentNode!=null) {
			 //��¡�ڵ�
			 RandomListNode cloneNode = currentNode.next;
			 //�ѵ�ǰ�ڵ�ָ����һ����ڵ�
			 currentNode.next=cloneNode.next;
			 //��ǰ��¡�ڵ�ָ����һ����¡�ڵ�
			 cloneNode.next=cloneNode.next==null?null:cloneNode.next.next;
			 //��Ϊ�Ѿ��ѵ�ǰ�ڵ��next�ض�����һ����ڵ㣬�������Ҫ�ƶ�����һ����ڵ㡣
			 currentNode= currentNode.next;
			 
		 }
		 return pCloneNode;
	    }
}
