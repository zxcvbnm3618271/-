package 面试金典;



/**
 * 请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。
给定一个string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。
 * @author 233admincol
 *
 */
public class 原串翻转 {
	public String reverseString(String iniString) {
		return swap(iniString);
		
	}
	public String swap(String value) {
		if (value.length()<=1) {
			return value;
		}else
		return (swap(value.substring(value.length()/2, value.length()))+swap(value.substring(0, value.length()/2)));
	}
	
}
