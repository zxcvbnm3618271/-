package test;
/**
 * 
 * @author 233admincol
 *����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
//����������������������������
public class ������������˫������ {
	   TreeNode head = null;
	    TreeNode realHead = null;
	    public TreeNode Convert(TreeNode pRootOfTree) {
	        ConvertSub(pRootOfTree);
	        return realHead;
	    }
	     
	    private void ConvertSub(TreeNode pRootOfTree) {
	        if(pRootOfTree==null) return;
	        //��ѯ������
	        ConvertSub(pRootOfTree.left);
	        if (head == null) {
	            head = pRootOfTree;
	            realHead = pRootOfTree;
	        } else {
	            head.right = pRootOfTree;
	            pRootOfTree.left = head;
	            head = pRootOfTree;
	        }
	        //��ѯ������
	        ConvertSub(pRootOfTree.right);
	    }
}
