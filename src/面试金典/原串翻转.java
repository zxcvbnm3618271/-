package ���Խ��;



/**
 * ��ʵ��һ���㷨���ڲ�ʹ�ö������ݽṹ�ʹ���ռ������£���תһ���������ַ���(����ʹ�õ������̱���)��
����һ��string iniString���뷵��һ��string��Ϊ��ת����ַ�������֤�ַ����ĳ���С�ڵ���5000��
 * @author 233admincol
 *
 */
public class ԭ����ת {
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
