package test;
// Definition for binary tree
  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
public class ��֪ǰ������ԭ2���� {
	
	//�ع������������ظ��ڵ�
	 public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        return null;
	    }
	 //����ǰ�������1��2��4��7��3��5��6��8�������������4��7��2��1��5��3��8��6��
	 /**
	  * preΪǰ���������
	  * startPreΪǰ������Ŀ�ʼ�±�
	  * endPreΪǰ������Ľ����±�
	  * inΪ�����������
	  * startInΪ���������ʼ�±�
	  * endInΪ������������±�
	  */
	 private TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn)
	 {
		 if (startPre>endPre ||startIn>endIn) {
			return null;
		}
		 //ǰ������ĵ�һ����һ���Ǹ�(���߸��ڵ�)
		 TreeNode root=new TreeNode(pre[startPre]);
		 //������������б���
		 for (int i = startIn; i <= endIn; i++) {
			//���������������ҵ��˸��ڵ㣬����ζ���ҵ��� ������
			 if (in[i]==pre[startPre]) {
				 
				root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
				root.right=reConstructBinaryTree(pre, i-startIn+startPre+1, endPre, in, i+1, endIn);
				break;
			}
			 
		}
		 return root;
	 }
}
