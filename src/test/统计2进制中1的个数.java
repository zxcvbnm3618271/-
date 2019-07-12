package test;
/**
 * 
 * @author 233admincol
 *输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class 统计2进制中1的个数 {
	/*
	 * 我们知道一个2进制数与减1后的2进制数进行与操作，则可消去当前位的1
	 * 比如：101100，减一后101011，与操作后101000，
	 * 通过与操作可统计1的个数
	 */
	 public int NumberOf1(int n) {
	        int count = 0;
	        while(n!= 0){
	            count++;
	            n = n & (n - 1);
	         }
	        return count;
	    }
}
