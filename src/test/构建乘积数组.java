package test;
/**
 * 
 * @author 233admincol
 *����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
 *����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
 *B[2]=A[0]*A[1] =B[1]*A[1]
 *B[3]=A[0]*A[1]*A[2]=B[2]*A[2]
 *
 */
public class �����˻����� {
	public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if(length != 0 ){
            B[0] = 1;
            //��������������
            for(int i = 1; i < length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            //����������
            for(int j = length-2; j >= 0; j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        return B;
    }
}
