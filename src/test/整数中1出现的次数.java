package test;
/**
 * 
 * @author 233admincol
 *���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 *Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�
 *ACMerϣ�����ǰ����,������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 */
public class ������1���ֵĴ��� {
	//�������ķ�������������������һ��
	 public int NumberOf1Between1AndN_Solution(int n) {
	        int count=0;
	        while(n>0){
	        	//�Ƚ�����ת�ַ���
	            String str=String.valueOf(n);
	            //�ٰ��ַ���ת�ַ�����
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
	  * ����Ǵ��еĹ���ʽ���ܿ�����಻��Ҫ�ıȽϣ��Ʋ�����û��ϵ����ס�Ͷ���
	  *  public int NumberOf1Between1AndN_Solution(int n) {
	  *  //��Ϊ�㣬����
         if(n <= 0)
             return 0;
             //ͳ��1���ֵĴ���
         int count = 0;
         //ÿ��ѭ������ʮ�����ж���λִ�ж��ٴ�
         for(long i = 1; i <= n; i *= 10){
             long diviver = i * 10;   
             //ħ�������ǶԵģ�����ʽ����       
             count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1, 0), i);
        }
         return count;
     }
	  * */
}
