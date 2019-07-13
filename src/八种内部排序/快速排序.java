package �����ڲ�����;

import java.util.Stack;

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
	
	//////////
	
	//�ǵݹ�ʵ�ֿ���
	public static void sortByStack(int[] a) {
	    Stack<Integer> stack = new Stack<Integer>();

	    //��ʼ״̬������ָ����ջ
	    stack.push(0);
	    stack.push(a.length - 1);
	    while (!stack.isEmpty()) {
	        //��ջ���л���
	        int high = stack.pop();
	        int low = stack.pop();

	        int pivotIndex = partition(a, low, high);

	        //�����м����
	        if (pivotIndex > low) {
	            stack.push(low);
	            stack.push(pivotIndex - 1);
	        }
	        if (pivotIndex < high && pivotIndex >= 0) {
	            stack.push(pivotIndex + 1);
	            stack.push(high);
	        }
	    }
	}

	private static int partition(int[] a, int low, int high) {
	    if (low >= high) return -1;
	    int left = low;
	    int right = high;
	    //�����׼��ֵ
	    int pivot = a[left];
	    while (left < right) {
	        //�Ӻ���ǰ�ҵ��Ȼ�׼С��Ԫ�أ����뵽��׼λ����
	        while (left < right && a[right] >= pivot) {
	            right--;
	        }
	        a[left] = a[right];
	        //��ǰ�����ҵ��Ȼ�׼���Ԫ��
	        while (left < right && a[left] <= pivot) {
	            left++;
	        }
	        a[right] = a[left];
	    }
	    //���û�׼ֵ��׼�����εݹ����
	    a[left] = pivot;
	    return left;
	}
	
}
