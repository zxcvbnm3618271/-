package test;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
/**
 * 
 * @author 233admincol
 *请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class 对称的二叉树 {
	//判断二叉树是否对称
	  boolean isSymmetrical(TreeNode pRoot)
	    {
		  //如果根节点为空，退出
	        if(pRoot == null){
	            return true;
	        }
	        return comRoot(pRoot.left, pRoot.right);
	    }
	    private boolean comRoot(TreeNode left, TreeNode right) {
	        // TODO Auto-generated method stub
	    	//如果左子树为空，则若右子树为空，对称
	        if(left == null)
	        	return right==null;
	        //如果右子树为空，因为左子树不为空，则不对称
	        if(right == null) 
	        	return false;
	        //如果左节点的值不等于右节点，也不对称
	        if(left.val != right.val) 
	        	return false;
	        return comRoot(left.right, right.left) && comRoot(left.left, right.right);
	    }
}
