package test;
/**
 * 
 * @author 233admincol
 *输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
//搜索树的中序遍历就是排序的数组
public class 二叉搜索树与双向链表 {
	   TreeNode head = null;
	    TreeNode realHead = null;
	    public TreeNode Convert(TreeNode pRootOfTree) {
	        ConvertSub(pRootOfTree);
	        return realHead;
	    }
	     
	    private void ConvertSub(TreeNode pRootOfTree) {
	        if(pRootOfTree==null) return;
	        //查询左子树
	        ConvertSub(pRootOfTree.left);
	        if (head == null) {
	            head = pRootOfTree;
	            realHead = pRootOfTree;
	        } else {
	            head.right = pRootOfTree;
	            pRootOfTree.left = head;
	            head = pRootOfTree;
	        }
	        //查询右子树
	        ConvertSub(pRootOfTree.right);
	    }
}
