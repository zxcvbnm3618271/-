package �����ڲ�����;

import java.util.Arrays;

/**ϣ�������ԭ��:���������������Ҫ����Ӵ�С���У��������Ƚ�������з��飬Ȼ�󽫽ϴ�ֵ�Ƶ�ǰ�棬��Сֵ
 * �Ƶ����棬�������������в���������������һ��ʼ���ò���������������ݽ������ƶ��Ĵ���������˵ϣ�������Ǽ�ǿ
 * ��Ĳ�������
 * ������5, 2, 8, 9, 1, 3��4��˵�����鳤��Ϊ7����incrementΪ3ʱ�������Ϊ��������
 * 5��2��8��9��1��3��4����һ������9��5�Ƚϣ�1��2�Ƚϣ�3��8�Ƚϣ�4�ͱ����±�ֵ6Сincrement(3)������ֵ��Ƚ�
 * �������ǰ��մӴ�С���У����Դ�Ļ�����ǰ�棬��һ�����������Ϊ9, 2, 8, 5, 1, 3��4
 * ��һ�κ�increment��ֵ��Ϊ3/2=1,��ʱ��������в�������
 *ʵ������Ӵ�С��
 */
public class ϣ������ {

	public static void shellSort(int[] data)
	{
		int j=0;
		int temp=0;
		for(int increment=data.length/2;increment>0;increment/=2) {
			for(int i=increment;i<data.length;i++)
			{
				temp=data[i];
				for(j=i;j>=increment;j=j-increment) {
					if (temp>data[j-increment]) {
						data[j]=data[j-increment];
					}else
					{
						break;
					}
				}
				//���������±�j��Ԫ��λ��
				data[j]=temp;
				for(int k=0;k<data.length;k++)
				{
					System.out.print(data[k]+" ");
				}
				System.out.println();
			}
		}
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data={5, 2, 8, 9, 1, 3,4};
		shellSort(data);
	}

}
