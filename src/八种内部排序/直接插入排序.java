package �����ڲ�����;

public class ֱ�Ӳ������� {
	//ͨ��ȫ����������������
	public static void sort1(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			//����ÿһ������Ƚ�ʱ,ǰi-1���������,��������ȫ�Ż��˷�����ѯʱ��
			for(int j=i+1;j>0;j--)
			{
				//��С��������,��������������
				if (a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
	
	//��sort1�����Ż�,������ֹ��ѯ������,������ν��ʱ�����
	public static void sort2(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int num=a[i];
			int j;
			//��������,�����ߵ���С��num,��ֹ��ѯ,������Щ������һλ
			for (j = i; j>0 && a[j-1]>num; j--) {
				a[j]=a[j-1];
						
			}
			a[j]=num;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
