package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * @author 233admincol
 *LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
 *��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
 *������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....
 *LL��������,��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13��
 *�����5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����
 *LL����ȥ��������Ʊ����
 * ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Σ�
 *  ����������˳�Ӿ����true����������false��Ϊ�˷������,�������Ϊ��С����0��
 */
public class �˿���˳�� {
	/*
	 * Ҫ��������⣬����֪����������������
	 * 1.max-min<5
	 * 2.��0����û���ظ�����������0 1 1 2 3��pass
	 * 
	 * */
	
	 public boolean isContinuous(int [] numbers) {
	       if(numbers == null)
	            return false;
	       //��Ҫע�����arraylist��sort������Ҫ�Զ����comparator��compare��������Arrays��sort����Ҫ
	        Arrays.sort(numbers);  //������
	        int zero = 0, i = 0;
	        //��i���������ʹ��һ��forѭ������0
	        for(; i < numbers.length && numbers[i] == 0; i++){
	            zero ++;  //ͳ��0�ĸ���
	        }
	        
	        for(; i < numbers.length - 1 && zero >= 0; i++){
	            if(numbers[i] == numbers[i+1]) //�ж��ӣ��򷵻�false
	                return false;
	            //���ƹ�ʽ
	            if(numbers[i] + 1 + zero >= numbers[i+1]){  //���Լ���ƥ��
	                zero -= numbers[i+1] - numbers[i] - 1;
	            }
	            else
	                return false;
	        }
	        if(i == numbers.length -1)
	            return true;
	        else
	            return false;
	   }
}
