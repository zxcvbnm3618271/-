package test;
/**
 * 
 * @author 233admincol
 *дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
 */
public class ���üӼ��˳����ӷ� {
	/*
	 * ��λ�������������ף�
	 * 1.λ����Ǽ�
	 * 2.λ�벢����һλ�ǽ�1
	 */
	 public int Add(int num1,int num2) {
		 //ֻҪ��λ��Ϊ0����������
	        while (num2!=0) {
	        	//��¼��������λ��ֵ
	            int temp = num1^num2;
	            //��¼��λ
	            num2 = (num1&num2)<<1;
	            //��ֵ
	            num1 = temp;
	        }
	        return num1;
	    }
}
