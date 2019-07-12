package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author 233admincol
 *请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
 *第三行按照从左到右的顺序打印，其他行以此类推。
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class 按之字形打印二叉树 {
	 public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
	        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	        if(pRoot==null){
	            return res;
	        }
	        
	        ArrayList<Integer> list;
	        //使用队列
	        Queue<TreeNode> queue=new LinkedList<TreeNode>();
	        //记录层数
	        int rows=1;
	        queue.add(pRoot);
	        while(!queue.isEmpty()){
	        	//将队列的值传到数组中
	            list=new ArrayList();
	            int size=queue.size();
	            for(int i=0;i<size;i++){
	            	//poll是队头弹出
	                TreeNode t=queue.poll();
	                if(rows%2==0){
                     //从右往左
	                    list.add(0,t.val);
	                }else{
                     //从左往右
	                    list.add(t.val);
	                }
	                //将下一层子节点添加到队列中
	                if(t.left!=null){
	                    queue.offer(t.left);
	                }
	                if(t.right!=null){
	                    queue.offer(t.right);
	                }
	            }
	            res.add(list);
	            rows++;
	        }
	        return res;
	 
	    }
}
