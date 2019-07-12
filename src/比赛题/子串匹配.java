package 比赛题;

import java.util.ArrayList;
import java.util.Scanner;


public class 子串匹配 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Scanner scanner2=new Scanner(System.in);
		boolean flag=true;
		ArrayList<String> strings=new ArrayList<>();
		strings.add(scanner.next());
		if (strings.get(0).length()>10000) {
			return;
		}
		String[] strings2=scanner2.nextLine().split(" ");
		if (strings2.length>10000) {
			return;
		}
		for(int i=0;i<strings2.length;i++)
		{
			strings.add(strings2[i]);
		}
		for(int i=1;i<strings.size();i++)
		{
		boolean now=strings.get(0).matches(".*"+strings.get(i)+".*");
		if (now == false) {
			flag=now;
		}
		}
		System.out.println(flag);
		
	}

}
