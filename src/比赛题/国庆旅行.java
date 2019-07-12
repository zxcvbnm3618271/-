package 比赛题;

import java.util.Arrays;
import java.util.Scanner;

class JD{
	public int pf;
	public int jl;
}
public class 国庆旅行 {

	public static int maxSum(int[] s) {
		JD a = new JD(),b = new JD();
		if (s.length<2) {
			return 0;
		}
		a.jl=s.length-1;
		a.pf=s[s.length-1];
		b.jl=s.length-2;
		b.pf=s[s.length-2];
		//b是近的,a是远的
		if (s.length<=2) {
			return (b.pf+b.jl+a.pf-a.jl);
		}
		for(int i=s.length-3;i>=0;i--)
		{		
			if((s[i]+i+b.pf-b.jl)>(b.pf+b.jl+a.pf-a.jl))
			{
				a.pf=b.pf;
				a.jl=b.jl;
				b.pf=s[i];
				b.jl=i;
			}
			else if((s[i]+i+a.pf-a.jl)>(b.pf+b.jl+a.pf-a.jl))
			{
				b.pf=s[i];
				b.jl=i;
			}
		}
		return (b.pf+b.jl+a.pf-a.jl);
	}
	
	public static void main(String[] args) {
		if (args.length == 0) {
			return;
			}
		Scanner scanner =new Scanner(System.in);
		Scanner scanner2=new Scanner(System.in);
		int N=scanner.nextInt();
		if (N>0) {
			int[] s=new int[N];
			for(int i=0;i<N;i++)
			{
				s[i]=scanner2.nextInt();
			}
			System.out.println(maxSum(s));
		}
		
	}
}
