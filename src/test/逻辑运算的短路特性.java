package test;
/**
 * 
 * @author 233admincol
 *��1+2+3+...+n��
 *Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
 */
public class �߼�����Ķ�·���� {
/*
 * 1.�������߼���Ķ�·����ʵ�ֵݹ���ֹ������ ����1&����2��������1Ϊ�٣�����2��ִ��
 * 2.��n==0ʱ��(n>0)&&((sum+=Sum_Solution(n-1))>0)ִֻ��ǰ����жϣ�Ϊfalse��Ȼ��ֱ�ӷ���0��
   3.��n>0ʱ��ִ��sum+=Sum_Solution(n-1)��ʵ�ֵݹ����Sum_Solution(n)��
 */
	//���ڵݹ麯������д��һ��Ҫ����ý����ݹ�������ͷ��ص����ݣ�����ʹ�õĵط���һ�������ۼ�,��,��,��
	public int Sum_Solution(int n) {
        int sum = n;
        //���ݹ鵽n=0ʱ����·.
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }
}
