package test_4;

import java.util.Arrays;

public class MaximumProfitonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int maximumProfit(int budget[]) {
		// Write your code here
		 Arrays.sort(budget); 
        int prft = 0;
		int n=budget.length;
        for (int i = 0; i < n; i++) {
            int left = n - i;
            int potentialProfit = left * budget[i];
            prft = Math.max(prft, potentialProfit);
        }

        return (prft);
	}


}
