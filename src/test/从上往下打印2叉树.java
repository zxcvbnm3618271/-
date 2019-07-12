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
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author 233admincol
 *
 */
public class 从上往下打印2叉树 {
	
	 public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
         ArrayList<Integer> list = new ArrayList<Integer>();
         if(root == null) return list;
         //deque是双向队列，使用链表构造
         Deque<TreeNode> deque = new LinkedList<TreeNode>();
         //将根节点压入双向队列中
         deque.add(root);
         while(!deque.isEmpty()){
        	 //队列的pop是弹出队列的第一个元素，及队头
             TreeNode t = deque.pop();
             //将节点值压入数组
             list.add(t.val);
             if(t.left != null) deque.add(t.left);
             if(t.right != null) deque.add(t.right);
         }
         return list;
     }
}
