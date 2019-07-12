package test;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
/**
 * 
 * @author 233admincol
 *@category
 *在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 
 *如果没有则返回 -1（需要区分大小写）.
 */

public class 第一个只出现一次的字符 {
	public int FirstNotRepeatingChar(String str)
    {
        char[] c = str.toCharArray();
        //开辟123个空间，下标表示字母，内容统计出现次数
        int[] a = new int['z'+1];
        for (char d : c)
            a[(int) d]++;
        for (int i = 0; i < c.length; i++)
            if (a[(int) c[i]] == 1)
                return i;
        return -1;
    }
}
/*
 * 还有一种方法既能用下标表示字母，内容也能存次数的方法，那就是hashmap,为了记录出现顺序，我们使用Linkedhashmap
 * 

  public int FirstNotRepeatingChar(String str) {
        LinkedHashMap <Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int time = map.get(str.charAt(i));
                map.put(str.charAt(i), ++time);
            }
            else {
                map.put(str.charAt(i), 1);
            }
        }
        int pos = -1;  
        int i=0;
        for(;i<str.length();i++){
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return pos;
    }
 */
