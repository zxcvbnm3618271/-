package 比赛题;

import java.util.Stack;

import javax.print.attribute.ResolutionSyntax;

import com.sun.accessibility.internal.resources.accessibility;

public class 逃离幻想乡 {

	public static void exert(int n,int L)
	{
		int count=0;
		int countHNT;
		for(int i=0;i<=n;i++)
		{
			int now=(int)Math.pow(2, i);
			while(now>=10) {
				now=now/10;
			}
			if (now==L) {
				count++;
			}
		}
		countHNT=count*2;
		 Stack<Integer> a = new Stack<Integer>();
         Stack<Integer> b = new Stack<Integer>();
         Stack<Integer> c = new Stack<Integer>();

         for (int i=countHNT; i>0; i--) {
              a.push(i);
         }
		int sum=movecount(countHNT, a, b, c);
		System.out.println(count);
		System.out.println(sum);
		
	}
	
	public static int movecount(int countHNT,Stack<Integer> A,Stack<Integer> B,Stack<Integer> C)
	{
		int sd=0;
		if (countHNT ==0) {
			return sd;
		}
		
		sd=1+movecount(countHNT-1, A, C, B);
		C.push(A.pop());
		sd=sd+movecount(countHNT-1, B, A, C);
	return sd;
	}
}
