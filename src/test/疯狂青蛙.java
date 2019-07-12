package test;
//һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
//�����������һ��n����̨���ܹ��ж�����������
public class ������� {

	public int JumpFloorII(int target)
	{
		if (target == 0) {
			return 0;
		}
		int[] dp = new int[target + 1];
		dp[0]=1;
		dp[1]=1;
		//��Ϊf(n)=2*f(n-1)=2*f(n-2)+f(n-1),
		//����n=3,��f(3)=2*f(2)=2*f(1)+f(2)=f(0)+f(1)+f(2)->f(n)=f(0)+f(1)+...+f(n-1)
		for (int i = 2; i <= target; i++) {
			dp[i]=0;
			for (int j = 0; j < i; j++) {
				dp[i]=dp[i]+dp[j];
			}
		}
		return dp[target];
		
	}
}
