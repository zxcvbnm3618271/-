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
    *�ݹ鵽���һ���ڵ㷵�����飬�Ӻ���ǰ������������ֵ
    */
public class ����ݹ���� {
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
