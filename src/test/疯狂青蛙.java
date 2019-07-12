package test;
//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
//求该青蛙跳上一个n级的台阶总共有多少种跳法。
public class 疯狂青蛙 {

	public int JumpFloorII(int target)
	{
		if (target == 0) {
			return 0;
		}
		int[] dp = new int[target + 1];
		dp[0]=1;
		dp[1]=1;
		//因为f(n)=2*f(n-1)=2*f(n-2)+f(n-1),
		//假设n=3,则f(3)=2*f(2)=2*f(1)+f(2)=f(0)+f(1)+f(2)->f(n)=f(0)+f(1)+...+f(n-1)
		for (int i = 2; i <= target; i++) {
			dp[i]=0;
			for (int j = 0; j < i; j++) {
				dp[i]=dp[i]+dp[j];
			}
		}
		return dp[target];
		
	}
}
