package test;

import com.sun.org.apache.xalan.internal.xsltc.dom.ClonedNodeListIterator;


//链节点
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class 复杂链表的复制 {
	//链节点复制函数，返回复制链头
	 public RandomListNode Clone(RandomListNode pHead)
	    {
		 /*
		 *解题思路：
		 *1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
		 *2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
		 *3、拆分链表，将链表拆分为原链表和复制后的链表
		 */
		 
		 if (pHead==null) {
			return null;
		}
		
		 //复制每一个节点，如复制A得到A1，将节点A1插到A后面
		 //当前节点
		 RandomListNode currentNode=pHead;
		 while(currentNode !=null) {
			 //保存当前节点的值
			 RandomListNode cloneNode=new RandomListNode(currentNode.label);
			 //保存当前节点指向的下一节点
			 RandomListNode nextNode = currentNode.next;
			 //将克隆节点插入链表
			 currentNode.next=cloneNode;
			 //将克隆节点的next指向下一个原节点
			 cloneNode.next = nextNode;
			 //将老节点的随机指针给克隆节点，A1.random=A.random.next
			 currentNode.next.random=currentNode.random==null?null:currentNode.random.next;
			 //当前节点移到原下一节点
			 currentNode=nextNode;
		 }
		 
		 //拆分链表，将链表拆分为原链表和复制后的链表
		 currentNode=pHead;
		 //记录克隆链表的头节点
		 RandomListNode pCloneNode = currentNode.next;
		 while(currentNode!=null) {
			 //克隆节点
			 RandomListNode cloneNode = currentNode.next;
			 //把当前节点指向下一个真节点
			 currentNode.next=cloneNode.next;
			 //当前克隆节点指向下一个克隆节点
			 cloneNode.next=cloneNode.next==null?null:cloneNode.next.next;
			 //因为已经把当前节点的next重定向到下一个真节点，因此现在要移动到下一个真节点。
			 currentNode= currentNode.next;
			 
		 }
		 return pCloneNode;
	    }
}
