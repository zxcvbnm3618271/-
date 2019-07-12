package 比赛题;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 链接：https://ac.nowcoder.com/acm/contest/900/B
来源：牛客网

今天，YPC正在热舞之中，嘴里唱着BJLY的神曲，沉浸在了自己的世界里。 然而Taeyeon又突然抽了一下，问YPC一个问题： 在一个长度为n的区间中，子区间[1,m],[2,m+1],[3,m+2],...,[n-m+1,n]中每个区间前K小之和的和是多少。

其中一个区间的前k小之和指的是将这个区间内的所有数从小到大排序后求出最前面的k个数之和
由于YPC热舞的起劲，无法自拔，于是这个问题只能你来回答。

输入:第一行三个整数：n,m,K，意思如题 第二行n个正整数：a[i]，意思如题
输出:输出仅一行，每个区间前K小的数之和的和。

输入:6 3 2
 2 3 1 4 5 6
输出:21

思路:排序
1 2 3 4 5 6
区间数:1 2 3 \ 2 3 4 \ 3 4 5\ 4 5 6\


 */
public class 求子区间前n个数之和的和 {

	public static int sum(int[] s1,int[] s2) {
		int sum=0;
		
		Arrays.sort(s2);
		for(int i=0;i<s1[0]-s1[1];i++) {
			for(int j=0;j<s1[2];j++)
			{
				sum=sum+s2[i+j];
			}
			
		}
		return sum;
	}
	
}
