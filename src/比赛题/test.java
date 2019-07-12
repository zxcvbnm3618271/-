package ±ÈÈüÌâ;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 int sum=0;
		 int count=0;
		 ArrayList<Integer> al=new ArrayList<>();
		 count=scanner.nextInt();
		 for(int i=0;i<count;i++)
		 {
			 al.add(scanner.nextInt());
		 }
		 for(int j=al.size()-1;j>0;j--)
		 {
			 int max=al.get(j);
			 for (int i = j-1; i >=0 ; i--) {
				if (max<al.get(i)) {
					max=al.get(i);
					
				}
			}
			 if (max!=al.get(j)) {
				sum++;
	
				al.remove(al.indexOf(max));
				al.add(max);
			}
		 }
		 System.out.println(sum);
	}
}

