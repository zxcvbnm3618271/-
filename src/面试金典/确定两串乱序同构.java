package ���Խ��;

import java.util.Arrays;

public class ȷ����������ͬ�� {
	 public boolean checkSam(String stringA, String stringB) {
	      //����Ҫ����ĳһ�����������һ������,��Ȼ�ǿ����ع�,
		 //��ô���������鰴�����ع�,ֻҪ�ع�����ͬ,����true
		 char[] sa=stringA.toCharArray();
		 char[] sb=stringB.toCharArray();
		 Arrays.sort(sa);
		 Arrays.sort(sb);
		return  Arrays.equals(sa, sb);
	    }
}
