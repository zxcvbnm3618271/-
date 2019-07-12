package test;
/**
 * 
 * @author 233admincol
 *输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 *如果是则输出Yes,否则输出No。
 *假设输入的数组的任意两个数字都互不相同。
 */
/*
 * 二叉搜索树也称为二叉排序树，是一个将数组按中序遍历的方式排成的树，规定:
 * （1）若左子树不空，则左子树上所有结点的值均小于它的根结点的值；
（2）若右子树不空，则右子树上所有结点的值均大于它的根结点的值； 
（3）左、右子树也分别为二叉排序树；
 */

//根据规定，将数组按升序排序可还原出中序遍历
public class 二叉搜索树的后序遍历 {
		//判断该数组是否为二叉排序树的后序遍历
	   public boolean VerifySquenceOfBST(int [] sequence) {
		   //如果长度为零
	        if(sequence.length == 0) return false;
	        //我们知道最后一个数为根，则从右往左遍历，第一个小于根的为左子树根，右子树根自然在根左侧1位
	        //如果从左往右找，则第一个大于根的值下标减一为左子树的根。
	        return IsTreeBST(sequence, 0, sequence.length-1);
	    }
	   
	   
	    public boolean IsTreeBST(int [] sequence,int start,int end ){
	        if(end <= start) return true;
	        int i = start;
	        //找出根的右子树的右子树
	        for (; i < end; i++) {
	            if(sequence[i] > sequence[end]) break;
	        }//如果根的右子树的右子树中有小于根的右子树的根的值，为假
	        for (int j = i; j < end; j++) {
	            if(sequence[j] < sequence[end]) return false;
	        }//用同一个方法分割左右子树，继续查询
	        return IsTreeBST(sequence, start, i-1) && IsTreeBST(sequence, i, end-1);
	    }
}
