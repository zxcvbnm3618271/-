package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*
 * һ�����������������������֮�⣬���������ֶ�������ż���Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 */
//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class ������ֻ����һ�ε����� {
	//���ⷨ
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        if(array.length < 2) return ;
	        int myxor = 0;
	        int flag = 1;
	        //���������������Ϊ������һ������(��ֻ���ֹ�һ��)de ���
	        for(int i = 0 ; i < array.length; ++ i )
	            myxor ^= array[i];
	        //��λ��0000 0001 & myxor��ֱ����������ͬ����һλ
	        
	        while((myxor & flag) == 0) flag <<= 1;
	       // num1[0] = myxor;
	        //num2[0] = myxor;
	        //�涨��flag���λΪ�������num2��򣬲�Ϊ�����num1���
	        for(int i = 0; i < array.length; ++ i ){
	            if((flag & array[i]) == 0) num2[0]^= array[i];
	            else num1[0]^= array[i];
	        }
	   
	         
	         
	    }
}
