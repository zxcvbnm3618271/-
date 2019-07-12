package test;
/**
 * 
 * @author 233admincol
 *给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 *其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 *B[2]=A[0]*A[1] =B[1]*A[1]
 *B[3]=A[0]*A[1]*A[2]=B[2]*A[2]
 *
 */
public class 构建乘积数组 {
	public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if(length != 0 ){
            B[0] = 1;
            //计算下三角连乘
            for(int i = 1; i < length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            //计算上三角
            for(int j = length-2; j >= 0; j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        return B;
    }
}
