package test;

import java.util.Arrays;

/**
 * 
 * @author 233admincol
 *��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 *��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 *��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 */
public class �����г��ִ�������һ����� {
	 public int MoreThanHalfNum_Solution(int [] array) {
	        int len=array.length;
	        if(len<1){
	            return 0;
	        }
	        int count=0;
	        //�Զ�����
	        Arrays.sort(array);
	        //����������ж��ֻҪ��������ִ�������һ�룬���������ֵһ�����������м�ֵ
	        int num=array[len/2];
	        for(int i=0;i<len;i++){
	            if(num==array[i])
	                count++;
	        }
	        if(count<=(len/2)){
	            num=0;
	        }
	        return num;
	    }
}
