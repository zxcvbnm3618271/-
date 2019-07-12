package 八种内部排序;

public class 快速排序 {
/*
 * 很像二分排序,只不过分界点是数组的第一个数
 */
	//递归实现快排
	public static void sort(int[] a,int low,int high)
	{
		 //如果排完了
		if(low>=high) {
				return;
		}
		int left=low;
		int right=high;
		//保存精准值
		int pivot=a[left];
		while(left<right) {
			//从后向前找到比基准小的元素
			while(left<right && a[right]>=pivot) {
				right--;
			}
			a[left]=a[right];
			//从前往后找到比基准大的元素
			while(left<right&&a[left]<=pivot) {
				left++;
			}
			a[right]=a[left];
		}
		//放置基准值,准备分治递归快排
		a[left]=pivot;
		sort(a, low, left-1);
		sort(a, left+1, high);
	}
	
}
