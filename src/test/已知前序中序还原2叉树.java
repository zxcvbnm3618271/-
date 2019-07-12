package test;
// Definition for binary tree
  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
public class 已知前序中序还原2叉树 {
	
	//重构二叉树并返回根节点
	 public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        return null;
	    }
	 //假设前序遍历（1，2，4，7，3，5，6，8），中序遍历（4，7，2，1，5，3，8，6）
	 /**
	  * pre为前序遍历数组
	  * startPre为前序遍历的开始下标
	  * endPre为前序遍历的结束下标
	  * in为中序遍历数组
	  * startIn为中序遍历开始下标
	  * endIn为中序遍历结束下标
	  */
	 private TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn)
	 {
		 if (startPre>endPre ||startIn>endIn) {
			return null;
		}
		 //前序遍历的第一个数一定是根(或者父节点)
		 TreeNode root=new TreeNode(pre[startPre]);
		 //对中序数组进行遍历
		 for (int i = startIn; i <= endIn; i++) {
			//如果在中序遍历中找到了根节点，就意味着找到左 右子树
			 if (in[i]==pre[startPre]) {
				 
				root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
				root.right=reConstructBinaryTree(pre, i-startIn+startPre+1, endPre, in, i+1, endIn);
				break;
			}
			 
		}
		 return root;
	 }
}
