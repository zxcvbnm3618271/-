package �����ڲ�����;

public class ������ {
	/*
	 * ��������
	 * i=��һ����Ҷ�ӽڵ�
	 * Ҷ�ӽڵ���Կ����ѷ��϶�Ҫ��Ľڵ�,���ڵ�������Լ�
	 */
public static void max_heapify(int[] a,int n) {
	int child;
	for(int i=(n-1)/2;i>=0;i--)
	{
		//n�ĸ��ڵ�����ӽڵ�
		child=2*i+1;
		//���n���Ǹ��ڵ�����ӽڵ� ���� ���ӽڵ�С�����ӽڵ�,�����ӽڵ���Ϊchild
		//Ŀ�����ҳ�ֵ�����ӽڵ��븸�ڵ�Ƚϴ�С
		if (child!=n&&a[child]<a[child+1]) {
			child++;
		}
		//������ڵ�С�����ӽڵ㽻�����ڵ��������ӽڵ��е����ֵ
		if (a[i]<a[child]) {
			int temp=a[i];
			a[i]=a[child];
			a[child]=temp;
		}
	}
}
//�������Ѳ�����
public static void build_Max_Heapandsort(int[] a)
{
	//forѭ����������Ϊ����,Ȼ���������������ĩβ��������,���õ��ź��������
	for(int i=a.length-1;i>0;i--) {
		max_heapify(a, i);
		int temp=a[0];
		a[0]=a[i];
		a[i]=temp;
	}
	}

}
