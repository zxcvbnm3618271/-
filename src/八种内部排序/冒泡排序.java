package 八种内部排序;

public class 冒泡排序 {
/*
 * 古老的算法,找最大,放最后,遍历次数减1
 */
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				//前面的元素比后面大就交换
	            if (a[j] > a[j + 1]) {
	                int temp = a[j];
	                a[j] = a[j + 1];
	                a[j + 1] = temp;
	            }
			}
		}
	}
	
}
