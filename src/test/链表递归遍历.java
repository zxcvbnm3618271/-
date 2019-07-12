package test;

import java.util.ArrayList;

   class ListNode {
      int val;
ListNode next = null;
       ListNode(int val) {
           this.val = val;
       }
  }
   /**
    * 
    * @author 233admincol
    *递归到最后一个节点返回数组，从后往前依次向数组填值
    */
public class 链表递归遍历 {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		public ArrayList<Integer> printListFromTailToHead(ListNode listnode)
		{
			if (listnode!=null) {
				this.printListFromTailToHead(listnode.next);
				arrayList.add(listnode.val);
			}
			return arrayList;
		}
}
