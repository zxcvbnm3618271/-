package test;

import test.*;

public class 二叉树镜像转置 {
		//转置函数
public void Mirror(TreeNode root) {
        TreeNode temp;
        if (root!=null) {
			temp=root.left;
			root.left=root.right;
			root.right=temp;
			if (root.left!=null) {
				Mirror(root.left);
			}
			if (root.right!=null) {
				Mirror(root.right);
			}
		}
    }
}
