package �����ڲ�����;
/*
 * ��ѡ��������һ����ԭʼ�������㷨,��������С�������,Ȼ����μ���ÿ�ֱ�������
 */
public class ��ѡ������ {
	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			//�ѵ�ǰ��i������С���±�
			int min=i;
			//�ҳ���С���±�
			for(int j=i+1;j<a.length;j++)
			{
				if (a[j]<a[min]) {
					min=j;
				}
			}
			//�����С�±겻һ��,�ͽ��������±��Ӧ�����ֵ����
			if (min!=i) {
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	}
	
}
