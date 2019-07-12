package test;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
/**
 * 
 * @author 233admincol
 *@category
 *��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, 
 *���û���򷵻� -1����Ҫ���ִ�Сд��.
 */

public class ��һ��ֻ����һ�ε��ַ� {
	public int FirstNotRepeatingChar(String str)
    {
        char[] c = str.toCharArray();
        //����123���ռ䣬�±��ʾ��ĸ������ͳ�Ƴ��ִ���
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
 * ����һ�ַ����������±��ʾ��ĸ������Ҳ�ܴ�����ķ������Ǿ���hashmap,Ϊ�˼�¼����˳������ʹ��Linkedhashmap
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
