package 八种内部排序;
/*
 * 简单选择排序是一种最原始的排序算法,就是挑最小或者最大,然后逐次减少每轮遍历次数
 */
public class 简单选择排序 {
	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			//把当前的i当作最小数下标
			int min=i;
			//找出最小数下标
			for(int j=i+1;j<a.length;j++)
			{
				if (a[j]<a[min]) {
					min=j;
				}
			}
			//如果最小下标不一样,就将这两个下标对应数组的值交换
			if (min!=i) {
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	}
	
}
