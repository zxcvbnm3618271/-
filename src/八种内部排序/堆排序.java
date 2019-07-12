package 八种内部排序;

public class 堆排序 {
	/*
	 * 构建最大堆
	 * i=第一个非叶子节点
	 * 叶子节点可以看作已符合堆要求的节点,根节点就是它自己
	 */
public static void max_heapify(int[] a,int n) {
	int child;
	for(int i=(n-1)/2;i>=0;i--)
	{
		//n的父节点的左子节点
		child=2*i+1;
		//如果n不是父节点的左子节点 并且 左子节点小于右子节点,将右子节点设为child
		//目的是找出值最大的子节点与父节点比较大小
		if (child!=n&&a[child]<a[child+1]) {
			child++;
		}
		//如果父节点小于右子节点交换父节点与左右子节点中的最大值
		if (a[i]<a[child]) {
			int temp=a[i];
			a[i]=a[child];
			a[child]=temp;
		}
	}
}
//创建最大堆并排序
public static void build_Max_Heapandsort(int[] a)
{
	//for循环调整数组为最大堆,然后把最大的数与数组末尾的数交换,最后得到排好序的数组
	for(int i=a.length-1;i>0;i--) {
		max_heapify(a, i);
		int temp=a[0];
		a[0]=a[i];
		a[i]=temp;
	}
	}

}
