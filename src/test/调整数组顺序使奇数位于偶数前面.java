package test;
/**
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 * @author 233admincol
 *
 */
public class ��������˳��ʹ����λ��ż��ǰ�� {
public void reOrderArray(int [] array) {
        //ð�ݷ�������
	for (int i = 0; i < array.length-1; i++) {
		for(int j=array.length-1;j>i;j--) {
			if (array[j]%2==1&&array[j-1]%2==0) {
				array[j]=array[j]+array[j-1];
				array[j-1]=array[j]-array[j-1];
			array[j]=array[j]-array[j-1];
			}
		}
	}
    }
}
