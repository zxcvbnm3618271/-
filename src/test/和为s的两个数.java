package test;

import java.util.ArrayList;

/*
 * ����һ����������������һ������S���������в�����������
 * ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 */
public class ��Ϊs�������� {
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
