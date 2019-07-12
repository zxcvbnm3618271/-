package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author 233admincol
 *��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ��
 *�����а��մ����ҵ�˳���ӡ���������Դ����ơ�
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class ��֮���δ�ӡ������ {
	 public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
	        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	        if(pRoot==null){
	            return res;
	        }
	        
	        ArrayList<Integer> list;
	        //ʹ�ö���
	        Queue<TreeNode> queue=new LinkedList<TreeNode>();
	        //��¼����
	        int rows=1;
	        queue.add(pRoot);
	        while(!queue.isEmpty()){
	        	//�����е�ֵ����������
	            list=new ArrayList();
	            int size=queue.size();
	            for(int i=0;i<size;i++){
	            	//poll�Ƕ�ͷ����
	                TreeNode t=queue.poll();
	                if(rows%2==0){
                     //��������
	                    list.add(0,t.val);
	                }else{
                     //��������
	                    list.add(t.val);
	                }
	                //����һ���ӽڵ���ӵ�������
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
