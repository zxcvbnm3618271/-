package ������;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ���ӣ�https://ac.nowcoder.com/acm/contest/900/A
��Դ��ţ����

��cosin�ı����ֱ����ĳ���gen��͵���ˡ�����������ǰ��gen���ң�ȥ�һ������ֱ�
��cosin����ǧ����࣬��ʱ3�죬�����ҵ���gen���ҡ���ͨ���۲췢��gen�����ڼң�����������͵͵Ǳ��gen���ң�Ȼ���һ��ֱ�������gen���ҵ���ǰ������һ����������������⿪��������ܽ���gen���ҡ�������cosinʵ����̫silly�ˣ���������������̡�����ٽ��������⣬gen������1��ͻ�ؼ��ˡ�
���������У���һ��һ������N���ڶ�����һ���ַ���S��|S|��6*105�����ַ���������Ӵ����ɣ�ÿ���Ӵ��ĸ�ʽ����XA
����X��һ���������A��һ�����֡�X������*��+��-��
%
%��^��^��ʾ�η�����
������Ҫ������N�����ַ���S�������ҽ������㡣��������������ľ���ֵ��

��Ŀ��֤���������N��
int
int(-2147483648~2147483647)��Χ�ڣ�^���������ֻ��Ϊ2��������̴������ң���������������ȼ�
 */
/*
 * ����:5
 * -7*3
 * ���
 * 6
 */
public class �������� {
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
