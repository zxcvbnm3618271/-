package test;

import java.util.ArrayList;

/**
 * 
 * @author 233admincol
 *输入一颗二叉树的跟节点和一个整数，
 *打印出二叉树中结点值的和为输入整数的所有路径。
 *路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 *(注意: 在返回值的list中，数组长度大的数组靠前)
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class 二叉树中和为某一值的路径 {
	//先用Arraylist创建2维数组
	private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
	//再开个数组保存当前路径
    private ArrayList<Integer> list = new ArrayList<Integer>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) return listAll;
        
        list.add(root.val);
        target -= root.val;
        //只有走到叶节点才算路径
        if(target == 0 && root.left == null && root.right == null)
            listAll.add(new ArrayList<Integer>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        return listAll;
    }
}
