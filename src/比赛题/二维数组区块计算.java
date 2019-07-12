package 比赛题;

import java.util.Scanner;

public class 二维数组区块计算 {

	public static void main(String[] args) {
		
		int N,M,count = 0;
	
	Scanner scanner=new Scanner(System.in);
	N=scanner.nextInt();
	M=scanner.nextInt();
	if (0<=N&&N<=10000000&&0<=M&&M<=10000000&&N*M<=10000000) {
		int[][] qk=new int[N][M];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				qk[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				if (qk[i][j]==1) {
					if ((j+1)<M) {
						if (qk[i][j+1]==1) {
							count++;
						}
					}
					if ((i+1)<N) {
						if (qk[i+1][j]==1) {
							count++;
						}
					}
				}

				
				
				if (N>2&&M>2) {
					if(i==0&&j==0)
					{
					if (qk[i][j]==1) {
						if (qk[i][M-1]==1) {
							count++;
						}
						if (qk[N-1][j]==1) {
							count++;
						}
					}
					}
					if (i==0&&j==M-1) {
						if (qk[i][j]==1) {
							if (qk[N-1][j]==1) {
								count++;
							}
						}
					}
					if (i==N-1&&j==0) {
						if (qk[i][j]==1) {
							if (qk[i][M-1]==1) {
								count++;
							}
						}
					}
				}
				
			}
		}
		System.out.println(count);
		
	}
	
}
}
