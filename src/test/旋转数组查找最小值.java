package test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.ArrayList;
import java.util.Vector;
public class ��ת���������Сֵ {
	public int minNumberInRotateArray(int[] array) {
		//��ָ����㿪ʼ����ָ����������ҿ�ʼ
		int low = 0 ; int high = array.length - 1; 
		while(low < high){
			//�ҳ������м�ֵ
		Integer mid = low + (high - low) / 2;
		//����м�ֵ������ָ��ֵ������ָ��ŵ��м�ֵ�Ҳ�
		if(array[mid] > array[high]){
		low = mid + 1;
		//����м�ֵ������ָ��ֵ��������ָ��ֵС�����ֵ������ָ��ֵ��С
		}else if(array[mid] == array[high]){
		if(array[high]<array[high-1]){
		return array[high];//Ҫ��������һ�д���
		}else{
			//�����ָ��ֵ���ڵ������ֵ����ָ������һλ
		high = high - 1;
		}
		//����м�ֵ��������ָ��ֵ����ָ���Ƶ��м�λ��
		}else{
		high = mid;
		} 
		}
		//�����ָ����ڵ�����ָ�룬��ָ��ֵ��С
		return array[low];
		}
}
