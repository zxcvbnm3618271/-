package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author 233admincol
 *输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */

//这里考察比较器的使用
public class 把数组排成最小数 {
	 public String PrintMinNumber(int [] numbers) {
	        int n;
	  String s="";
	  ArrayList<Integer> list= new ArrayList<Integer>();
	  //记录数组长度
	  n=numbers.length;
	  //将数组数据传入新数组
	  for(int i=0;i<n;i++){
	   list.add(numbers[i]);
	   
	  }
	  //排序函数需要排序器的参与
	  Collections.sort(list, new Comparator<Integer>(){
	  //重载函数
	  public int compare(Integer str1,Integer str2){
	   String s1=str1+""+str2;
	   String s2=str2+""+str1;
	         return s1.compareTo(s2);
	     }
	  });
	  
	  for(int j:list){
	   s+=j;
	  }
	        return s;
	    }
}
