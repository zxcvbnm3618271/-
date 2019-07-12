package test;
/**
 * 
 * @author 233admincol
 *求1+2+3+...+n，
 *要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class 逻辑运算的短路特性 {
/*
 * 1.需利用逻辑与的短路特性实现递归终止。就是 条件1&条件2，若条件1为假，条件2不执行
 * 2.当n==0时，(n>0)&&((sum+=Sum_Solution(n-1))>0)只执行前面的判断，为false，然后直接返回0；
   3.当n>0时，执行sum+=Sum_Solution(n-1)，实现递归计算Sum_Solution(n)。
 */
	//关于递归函数的书写，一定要先想好结束递归的条件和返回的数据，在想使用的地方，一般用于累加,减,乘,除
	public int Sum_Solution(int n) {
        int sum = n;
        //当递归到n=0时，短路.
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }
}
