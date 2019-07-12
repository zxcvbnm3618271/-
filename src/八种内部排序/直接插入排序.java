package 八种内部排序;

public class 直接插入排序 {
	//通过全交换让数组变得有序
	public static void sort1(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			//由于每一次排序比较时,前i-1个是有序的,这里用了全排会浪费许多查询时间
			for(int j=i+1;j>0;j--)
			{
				//从小到大排序,不满足条件交换
				if (a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
	
	//对sort1进行优化,加入终止查询的条件,避免无谓的时间损耗
	public static void sort2(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int num=a[i];
			int j;
			//升序排序,如果左边的数小于num,终止查询,否则这些数右移一位
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
