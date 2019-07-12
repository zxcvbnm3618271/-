package test;

import java.util.Scanner;
import java.util.Arrays;
public class Number {
	public static void main(String args[]) {
	     Scanner scanner=new Scanner(System.in);
	     int n=scanner.nextInt();
	     long[] array=new long[n];
	     for(int i = 0 ;i<n;i++)
	     {
	    	 array[i]=scanner.nextLong();
	     }
	     getLargeMul(array,n);
}

	private static void getLargeMul(long[] array, int n) {
		// TODO Auto-generated method stub
		long max1=0,max2=0,max3=0,min1=0,min2=0;
		for(int i=0;i<n;i++) {
			if ( array[i]!=0) {
				if (array[i]>max1) {
					max3=max2;
					max2=max1;
					max1=array[i];
				}else if (array[i]>max2) {
					max3=max2;
					max2=array[i];
				}else if (array[i]>max3) {
					max3=array[i];
				}else if (array[i]<min1) {
					min2=min1;
					min1=array[i];
				}else if (array[i]>min1 && array[i]<min2) {
					min2=array[i];
				}
				
			}else
				continue;
		}
		long max=Math.max(max1*max2*max3, max1*min1*min2);
		System.out.println(max);
	}
	
}