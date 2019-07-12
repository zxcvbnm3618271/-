package 比赛题;

import java.util.ArrayList;
import java.util.Scanner;

public class 寻找幸运数 {
	public static long cut(long k,ArrayList<Long> zc)
	{
		long sum=0;
		for(int i=0;i<zc.size();i++)
		{
			sum=sum+zc.get(i);
		}
		if (sum<k) {
			return sum;
		}
		else {
			zc.clear();
			while(sum/k>0)
			{
				zc.add(0,sum%k);
				sum=sum/k;
			}
			zc.add(0,sum%k);
			return cut(k, zc);
		}
	}
public static void main(String[] args)
{
	long k,b;
	int n,count=0;
	long sum=0;
	
	ArrayList<Long> zc=new ArrayList<>();
	Scanner scanner=new Scanner(System.in);
		k=scanner.nextLong();
		b=scanner.nextLong();
		n=scanner.nextInt();
		
		long[] sw=new long[n];
		while(scanner.hasNext())
		{
			for(int i=0;i<n;i++)
			{
				sw[i]=scanner.nextLong();
				if (sw[i]>k) {
					return;
				}
			}
			for(int i=1;i<n;i++)
			{
				for(int j=0;j+i<=n;j++)
				{
					for(int l=0;l<i;l++)
					{
						zc.add(sw[j+l]);
					}
					sum=cut(k,zc);
					if (sum==b) {
						count++;
					}
					zc.clear();
				}
			}
			System.out.println(count);
			zc.clear();
		}
		
}
}
