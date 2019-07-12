package test;
import java.util.*;
public class 字符串最后一个单词的长度 {

	public static void main(String args[])
	{
	    Scanner scanner=new Scanner(System.in);
	    StringBuffer st=new StringBuffer(scanner.nextLine());
	    String[] ts=st.toString().split(" ");
	    System.out.println(ts[ts.length-1].length());
	}
}
