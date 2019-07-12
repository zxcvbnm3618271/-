package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class 数组中只出现一次的数字 {
	//异或解法
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        if(array.length < 2) return ;
	        int myxor = 0;
	        int flag = 1;
	        //与所有数异或，则结果为两个不一样的数(都只出现过一次)de 异或
	        for(int i = 0 ; i < array.length; ++ i )
	            myxor ^= array[i];
	        //按位与0000 0001 & myxor，直到两个数不同的那一位
	        
	        while((myxor & flag) == 0) flag <<= 1;
	       // num1[0] = myxor;
	        //num2[0] = myxor;
	        //规定在flag标记位为零的数与num2异或，不为零的与num1异或
	        for(int i = 0; i < array.length; ++ i ){
	            if((flag & array[i]) == 0) num2[0]^= array[i];
	            else num1[0]^= array[i];
	        }
	   
	         
	         
	    }
}
