package test;

import java.util.ArrayList;

/**
 * 
 * @author 233admincol
 *����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣
 *���磬 ��5��3��7��2��4��6��8��    �У��������ֵ��С˳�����С����ֵΪ4��
 */
public class �����������ĵ�K���ڵ� {
	int count=0;
	int sum=0;
	TreeNode tNode;
	 ArrayList<Integer> ls=new ArrayList<Integer>();
	 TreeNode KthNode(TreeNode pRoot, int k)
	    {
	       
	        if (pRoot==null) {
				return pRoot;
			}
	        sum=k;
	        searchTreeNode(pRoot);
	        return tNode;
	    }
	 void searchTreeNode(TreeNode node)
	 {
		 if (node!=null) {
			searchTreeNode(node.left);
			count++;
			if (count==sum) {
				tNode=node;
			}
			searchTreeNode(node.right);
		}else
			return; 
	 }

}
