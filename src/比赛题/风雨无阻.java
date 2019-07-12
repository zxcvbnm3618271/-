package 比赛题;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 链接：https://ac.nowcoder.com/acm/contest/900/A
来源：牛客网

许cosin的宝贝手表被他的仇人gen海偷走了。他决定秘密前往gen海家，去找回他的手表。
许cosin历经千辛万苦，耗时3天，终于找到了gen海家。他通过观察发现gen海不在家，于是他决定偷偷潜入gen海家，然后找回手表。但他在gen海家的门前发现了一个密码锁，他必须解开这个锁才能进入gen海家。可是许cosin实在是太silly了，于是他就向你请教。请快速解决这个问题，gen海还有1秒就会回家了。
锁上有两行，第一行一个数字N。第二行是一串字符串S（|S|≤6*105），字符串由许多子串构成，每个子串的格式均是XA
其中X是一个运算符，A是一个数字。X可能是*，+，-，
%
%，^（^表示次方）。
现在需要把数字N代入字符串S，从左到右进行运算。密码就是运算结果的绝对值。

题目保证运算过程中N在
int
int(-2147483648~2147483647)范围内，^后面的数字只能为2。运算过程从左至右，不满足运算的优先级
 */
/*
 * 输入:5
 * -7*3
 * 输出
 * 6
 */
public class 风雨无阻 {
	public static int answer(int N,StringBuffer S) {
		int i=S.length()-1;
		ArrayList<String> A = new ArrayList<>();	
		ArrayList<String> B = new ArrayList<>();
		String fuhao;
		String ys;
		int sum=N;
		while(i>=0) {
			if (S.charAt(i)=='+' ||S.charAt(i)=='-' || S.charAt(i)=='*' || S.charAt(i)=='%' ||S.charAt(i)=='^') {
				A.add(S.substring(i, i+1));
				B.add(S.substring(i+1));
				S.delete(i, S.length());
			}
				i--;
		}
		
		while(!B.isEmpty()||!A.isEmpty()) {
			ys=B.remove(B.size()-1);
			fuhao=A.remove(A.size()-1);
			switch (fuhao) {
			case "+":
				sum=sum+Integer.parseInt(ys);
				break;
			case "-":
				sum=sum-Integer.parseInt(ys);
				break;
			case "%":
				sum=sum%Integer.parseInt(ys);
				break;
			case "*":
				sum=sum*Integer.parseInt(ys);
				break;
			case "^":
				sum=(int)Math.pow(sum,Integer.parseInt(ys));
				break;
			default:
				break;
			}
			
		}
		return Math.abs(sum);
	}
	
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	Scanner scanner2=new Scanner(System.in);
	 int n = 0;
	 StringBuffer S;
		 n=scanner.nextInt();
		 S=new StringBuffer(scanner2.nextLine());
	
	System.out.println( answer(n,S));

 }
}
