package test;
/**
 * 
 * @author 233admincol
 *����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 *����������Yes,�������No��
 *�������������������������ֶ�������ͬ��
 */
/*
 * ����������Ҳ��Ϊ��������������һ�������鰴��������ķ�ʽ�ųɵ������涨:
 * ��1�������������գ��������������н���ֵ��С�����ĸ�����ֵ��
��2�������������գ��������������н���ֵ���������ĸ�����ֵ�� 
��3����������Ҳ�ֱ�Ϊ������������
 */

//���ݹ涨�������鰴��������ɻ�ԭ���������
public class �����������ĺ������ {
		//�жϸ������Ƿ�Ϊ�����������ĺ������
	   public boolean VerifySquenceOfBST(int [] sequence) {
		   //�������Ϊ��
	        if(sequence.length == 0) return false;
	        //����֪�����һ����Ϊ��������������������һ��С�ڸ���Ϊ��������������������Ȼ�ڸ����1λ
	        //������������ң����һ�����ڸ���ֵ�±��һΪ�������ĸ���
	        return IsTreeBST(sequence, 0, sequence.length-1);
	    }
	   
	   
	    public boolean IsTreeBST(int [] sequence,int start,int end ){
	        if(end <= start) return true;
	        int i = start;
	        //�ҳ�������������������
	        for (; i < end; i++) {
	            if(sequence[i] > sequence[end]) break;
	        }//�������������������������С�ڸ����������ĸ���ֵ��Ϊ��
	        for (int j = i; j < end; j++) {
	            if(sequence[j] < sequence[end]) return false;
	        }//��ͬһ�������ָ�����������������ѯ
	        return IsTreeBST(sequence, start, i-1) && IsTreeBST(sequence, i, end-1);
	    }
}
