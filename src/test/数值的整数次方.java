package test;
import java.util.*;
/**
 * 
 * @author 233admincol
 *����һ��double���͵ĸ�����base��int���͵�����exponent��
 *��base��exponent�η���
 */
public class ��ֵ�������η� {
	public double Power(double base, int exponent) {
		//�η���Ϊ0
		
        if(exponent==0 && base != 0)
            return 1;
        //�η���Ϊ1
        if(exponent==1)
            return base;
        //����Ϊ0���η���С��0
        if(base == 0 && exponent <= 0){
            throw new RuntimeException();
        }//����Ϊ0���η�������0
        if(base ==0 && exponent>0){ 
            return 0;
        }
        //nΪ�η����ľ���ֵ
        int n= exponent;
        if(exponent<0){
            n = -exponent;
        }
        double  result=Power(base,n>>1);
        result*=result;
        if((n&1)==1)
            result*=base; 
        if(exponent<0)
            result=1/result;
        return result;     
  }
}
