package �����ڲ�����;

public class ð������ {
/*
 * ���ϵ��㷨,�����,�����,����������1
 */
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				//ǰ���Ԫ�رȺ����ͽ���
	            if (a[j] > a[j + 1]) {
	                int temp = a[j];
	                a[j] = a[j + 1];
	                a[j + 1] = temp;
	            }
			}
		}
	}
	
}
