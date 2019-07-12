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
 *��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
 */
public class �ԳƵĶ����� {
	//�ж϶������Ƿ�Գ�
	  boolean isSymmetrical(TreeNode pRoot)
	    {
		  //������ڵ�Ϊ�գ��˳�
	        if(pRoot == null){
	            return true;
	        }
	        return comRoot(pRoot.left, pRoot.right);
	    }
	    private boolean comRoot(TreeNode left, TreeNode right) {
	        // TODO Auto-generated method stub
	    	//���������Ϊ�գ�����������Ϊ�գ��Գ�
	        if(left == null)
	        	return right==null;
	        //���������Ϊ�գ���Ϊ��������Ϊ�գ��򲻶Գ�
	        if(right == null) 
	        	return false;
	        //�����ڵ��ֵ�������ҽڵ㣬Ҳ���Գ�
	        if(left.val != right.val) 
	        	return false;
	        return comRoot(left.right, right.left) && comRoot(left.left, right.right);
	    }
}
