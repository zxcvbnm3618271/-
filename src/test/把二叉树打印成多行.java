package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.sun.corba.se.impl.orbutil.graph.Node;

/**
 * 
 * @author 233admincol
 *���ϵ��°����ӡ��������ͬһ����������������ÿһ�����һ�С�
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
/*
 * �ݹ鷽ʽ����
 * ���ӣ�https://www.nowcoder.com/questionTerminal/445c44d982d04483b04a54f298796288
��Դ��ţ����

 ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        depth(pRoot, 1, list);
        return list;
    }
     
    private void depth(TreeNode root, int depth, ArrayList<ArrayList<Integer>> list) {
        if(root == null) return;
        if(depth > list.size())
            list.add(new ArrayList<Integer>());
        list.get(depth -1).add(root.val);
         
        depth(root.left, depth + 1, list);
        depth(root.right, depth + 1, list);
    }
 */
public class �Ѷ�������ӡ�ɶ��� {
	 ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		    ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		    Queue<TreeNode> queue=new LinkedList<TreeNode>();
		    if(pRoot==null){
	            return res;
	        }
		    queue.add(pRoot);
		   
		    while(!queue.isEmpty())
		    {
		    	int size=queue.size();
		    	ArrayList<Integer> list=new ArrayList<>();
		    	for (int i = 0; i <size ; i++) {
		    		 
					TreeNode node=queue.poll();
					
		    		list.add(node.val);
		    		if (node.left!=null) {
						queue.offer(node.left);
					}
		    		if (node.right!=null) {
						queue.offer(node.right);
					}
				}
		    	res.add(list);
		    	
		    }
		    return res;
	    }
}
