package lec_DynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int[] dp = new int[n + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}

		System.out.println(fib(n));

	}

	private static int fib(int[] dp, int n) {
		// TODO Auto-generated method stub

		if (n == 0 || n == 1) {
			return n;
		}

		int ans1, ans2;

		if (dp[n - 1] == -1) {
			ans1 = fib(dp, n - 1);
			dp[n - 1] = ans1;
		} else {
			ans1 = dp[n - 1];
		}
		if (dp[n - 2] == -1) {
			ans2 = fib(dp, n - 2);
			dp[n - 2] = ans2;
		} else {
			ans2 = dp[n - 2];
		}

		return ans1 + ans2;
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub

		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[dp.length - 1];

	}

}
