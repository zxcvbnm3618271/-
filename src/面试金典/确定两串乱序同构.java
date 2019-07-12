package 面试金典;

import java.util.Arrays;

public class 确定两串乱序同构 {
	 public boolean checkSam(String stringA, String stringB) {
	      //不需要按照某一组数组对照另一组数组,既然是可以重构,
		 //那么将两个数组按升序重构,只要重构后相同,就是true
		 char[] sa=stringA.toCharArray();
		 char[] sb=stringB.toCharArray();
		 Arrays.sort(sa);
		 Arrays.sort(sb);
		return  Arrays.equals(sa, sb);
	    }
}
