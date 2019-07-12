package test;

import java.util.ArrayList;

/**
 * 
 * @author 233admincol
 *给定一棵二叉搜索树，请找出其中的第k小的结点。
 *例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class 二叉搜索树的第K个节点 {
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
