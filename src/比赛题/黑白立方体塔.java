package 比赛题;

import java.util.ArrayList;
import java.util.Scanner;

public class 黑白立方体塔 {

	
	public static long c;

	public static void alph(long w,long b,long h)
	{
		if (b<h&&w<h ||h==0) {
			return;
		}
		
		if(w>=h&&b>=h)
		{
			
			alph(w-h,b, h-1);
			alph(w, b-h, h-1);
			c=(c+1)%1000000007;	
		}
		 if (w>=h&&b<h) {
			alph(w-h, b, h-1);
		}
		 if (b>=h&&w<h) {
			
			alph(w, b-h, h-1);
		}
	return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long h=0;
		Scanner scanner = new Scanner(System.in);
		//w白色,b黑色,h高度,c方案数
		long w,b;
		while(scanner.hasNext())
		{
			w=scanner.nextLong();
			b=scanner.nextLong();
			for(int i=1;((i+1)*i/2)<=(w+b);i++)
			{
				h=i;
			}
			if (h>0) {
				c=1;
			}
		alph(w,b,h);
		System.out.println(h+" "+c);
		}
		
	}

}
