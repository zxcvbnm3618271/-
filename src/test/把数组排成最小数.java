package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author 233admincol
 *����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 *������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 */

//���￼��Ƚ�����ʹ��
public class �������ų���С�� {
	 public String PrintMinNumber(int [] numbers) {
	        int n;
	  String s="";
	  ArrayList<Integer> list= new ArrayList<Integer>();
	  //��¼���鳤��
	  n=numbers.length;
	  //���������ݴ���������
	  for(int i=0;i<n;i++){
	   list.add(numbers[i]);
	   
	  }
	  //��������Ҫ�������Ĳ���
	  Collections.sort(list, new Comparator<Integer>(){
	  //���غ���
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
