package test;

import java.util.ArrayList;
import java.util.List;

/*
 * ͳ��һ�����������������г��ֵĴ�����
 */
public class ���������������г��ֵĴ��� {
	
	 public int GetNumberOfK(int [] array , int k) {
	        int count=0;
	        for(int i=0;i<array.length;i++){
	           if(array[i]==k)
	               count++;
	       }
	        return count;
	    }
}
