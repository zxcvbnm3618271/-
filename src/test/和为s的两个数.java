package test;

import java.util.ArrayList;

/*
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class 和为s的两个数 {
public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	        ArrayList<Integer> res=new ArrayList<>();
	        int n = array.length;
	        int i = 0, j = n - 1;
	        while(i < j){
	            if(array[i] + array[j] == sum){
	                res.add(array[i]);
	                res.add(array[j]);
	                break;
	            }
	            while(i < j && array[i] + array[j] > sum) --j;
	            while(i < j && array[i] + array[j] < sum) ++i;
	        }
	        return res;
	    
    }
}
