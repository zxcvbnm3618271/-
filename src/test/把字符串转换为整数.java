package test;
/**
 * 
 * @author 233admincol
 *��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�����string����������Ҫ��ʱ����0)��
 *Ҫ����ʹ���ַ���ת�������Ŀ⺯����
 * ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
 */
public class ���ַ���ת��Ϊ���� {
	  public static boolean flag;
	  
	    public static int StrToInt(String str) {
	        flag = false;
	        //�ж������Ƿ�Ϸ�
	        if (str == null || str.trim().equals("")) {
	            flag = true;
	            return 0;
	        }
	        // symbol=0,˵������Ϊ����;symbol=1������Ϊ����;start�������ֵ�һλ�Ƿ�Ϊ����λ
	        int symbol = 0;
	        int start = 0;
	        char[] chars = str.trim().toCharArray();
	        if (chars[0] == '+') {
	            start = 1;
	        } else if (chars[0] == '-') {
	            start = 1;
	            symbol = 1;
	        }
	        int result = 0;
	        for (int i = start; i < chars.length; i++) {
	            if (chars[i] > '9' || chars[i] < '0') {
	                flag = true;
	                return 0;
	            }
	            //sum�����������
	            int sum= result * 10 + (int) (chars[i] - '0');
	             
	             
	            if((sum-(int) (chars[i] - '0'))/10!=result){
	                flag=true;
	                return 0;
	            }
	             //result�ǽ����ÿѭ��һ�Σ���һ�ν������10��
	            result=result * 10 + (int) (chars[i] - '0');
	            /*
	             * ������Ϊjava���ŵ�һ�ж��Ƿ�����Ǵ���ģ��ٸ�����
	             * ������Ϊvalue=2147483648ʱ���ڼ�����ڲ��ı�ʾӦ����-2147483648
	             * ��Ȼvalue>Integer.MAX_VALUE�ǲ�������
	            */
	        }
	        // ע�⣺java��-1��n�η������ã�(-1)^n .'^'�������
	        // ע�⣬��value=-2147483648ʱ��value=-value
	        //��pow�������
	        result = (int) Math.pow(-1, symbol) * result;
	        return result;
	    }
}
