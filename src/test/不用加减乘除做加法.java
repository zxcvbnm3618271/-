package test;
/**
 * 
 * @author 233admincol
 *写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class 不用加减乘除做加法 {
	/*
	 * 用位操作，必须明白：
	 * 1.位异或是加
	 * 2.位与并左移一位是进1
	 */
	 public int Add(int num1,int num2) {
		 //只要进位不为0，则继续相加
	        while (num2!=0) {
	        	//记录不包括进位的值
	            int temp = num1^num2;
	            //记录进位
	            num2 = (num1&num2)<<1;
	            //传值
	            num1 = temp;
	        }
	        return num1;
	    }
}
