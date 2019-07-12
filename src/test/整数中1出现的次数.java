package test;
/**
 * 
 * @author 233admincol
 *求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 *为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 *ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class 整数中1出现的次数 {
	//这个是最笨的方法，即将所有数都走一遍
	 public int NumberOf1Between1AndN_Solution(int n) {
	        int count=0;
	        while(n>0){
	        	//先将数字转字符串
	            String str=String.valueOf(n);
	            //再把字符串转字符数组
	            char [] chars=str.toCharArray();
	            for(int i=0;i<chars.length;i++){
	                if(chars[i]=='1')
	                    count++;
	            }
	            n--;
	        }
	        return count;
	    }
	 /*
	  * 这个是大佬的归纳式，避开了许多不必要的比较，推不出来没关系，记住就对了
	  *  public int NumberOf1Between1AndN_Solution(int n) {
	  *  //数为零，结束
         if(n <= 0)
             return 0;
             //统计1出现的次数
         int count = 0;
         //每次循环扩大十倍，有多少位执行多少次
         for(long i = 1; i <= n; i *= 10){
             long diviver = i * 10;   
             //魔鬼，但是是对的，当公式背吧       
             count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1, 0), i);
        }
         return count;
     }
	  * */
}
