package 比赛题;

import java.util.Scanner;

public class 平面 {
public static void main(String[] args) {
	Long n,a;
	Scanner scanner=new Scanner(System.in);
	while(scanner.hasNext()) {
		n=(long) scanner.nextInt();
		n=n*2;
		a=n*(n+1)/2+1;
		System.out.println(a);
	}
}
}
