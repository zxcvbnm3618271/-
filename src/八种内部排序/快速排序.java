package �����ڲ�����;

public class �������� {
/*
 * �����������,ֻ�����ֽ��������ĵ�һ����
 */
	//�ݹ�ʵ�ֿ���
	public static void sort(int[] a,int low,int high)
	{
		 //���������
		if(low>=high) {
				return;
		}
		int left=low;
		int right=high;
		//���澫׼ֵ
		int pivot=a[left];
		while(left<right) {
			//�Ӻ���ǰ�ҵ��Ȼ�׼С��Ԫ��
			while(left<right && a[right]>=pivot) {
				right--;
			}
			a[left]=a[right];
			//��ǰ�����ҵ��Ȼ�׼���Ԫ��
			while(left<right&&a[left]<=pivot) {
				left++;
			}
			a[right]=a[left];
		}
		//���û�׼ֵ,׼�����εݹ����
		a[left]=pivot;
		sort(a, low, left-1);
		sort(a, left+1, high);
	}
	
}
