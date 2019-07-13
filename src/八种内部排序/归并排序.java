package 八种内部排序;

public class 归并排序 {
/*
 * 递归实现归并排序
 */
	//并归所需的辅助数组
	private static int[] aux;
	public static void sort(int[] a) {
		//一次性分配空间
		aux=new int[aux.length];
		sort(a,0,a.length-1);
	}
	
	public static void sort(int[] a,int low,int high) {
		if (low>=high) {
			return;
		}
		int mid=(low+high)/2;
		//将左半边排序
		sort(a,low,mid);
		//将右半边排序
		sort(a, mid+1, high);
		merge(a,low,mid,high);
	}
	/*
	 * 该方法先将所有元素复制到aux[]中,然后归并回a[]中,方法归并时
	 * 进行了4个条件判断:
	 * 如果左半边用尽(取右半边的元素)
	 * 如果右半边用尽(取左半边的元素)
	 * 如果右半边的当前元素小于左半边的当前元素(取右半边的元素)
	 * 如果右半边的当前元素大于等于左半边的当前元素(取右半边的元素)
	 */
	public static void merge(int[] a,int low,int mid,int high)
	{
		int i=low,j=mid+1;
		for(int k=low;k<=high;k++)
		{
			aux[k]=a[k];
		}
		for(int k=low;k<=high;k++)
		{
			if(i>mid)
			{a[k]=aux[j++];}
			else if(j>high)
			{a[k]=aux[i++];}
			else if(aux[j]<aux[i])
			{
				a[k]=aux[j++];
			}else {
				a[k]=aux[i++];
			}
		}
	}
	
}
