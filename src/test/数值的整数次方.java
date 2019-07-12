package test;
import java.util.*;
/**
 * 
 * @author 233admincol
 *给定一个double类型的浮点数base和int类型的整数exponent。
 *求base的exponent次方。
 */
public class 数值的整数次方 {
	public double Power(double base, int exponent) {
		//次方数为0
		
        if(exponent==0 && base != 0)
            return 1;
        //次方数为1
        if(exponent==1)
            return base;
        //底数为0，次方数小于0
        if(base == 0 && exponent <= 0){
            throw new RuntimeException();
        }//底数为0，次方数大于0
        if(base ==0 && exponent>0){ 
            return 0;
        }
        //n为次方数的绝对值
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
