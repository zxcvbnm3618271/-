package test;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
/**
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * @author 233admincol
 *
 */
public class �������´�ӡ2���� {
	
	 public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
         ArrayList<Integer> list = new ArrayList<Integer>();
         if(root == null) return list;
         //deque��˫����У�ʹ��������
         Deque<TreeNode> deque = new LinkedList<TreeNode>();
         //�����ڵ�ѹ��˫�������
         deque.add(root);
         while(!deque.isEmpty()){
        	 //���е�pop�ǵ������еĵ�һ��Ԫ�أ�����ͷ
             TreeNode t = deque.pop();
             //���ڵ�ֵѹ������
             list.add(t.val);
             if(t.left != null) deque.add(t.left);
             if(t.right != null) deque.add(t.right);
         }
         return list;
     }
}
