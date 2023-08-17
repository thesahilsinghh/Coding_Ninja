package recursion_Assignments;

public class CountZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int countZerosRec(int input) {
		// Write your code here

		if (input == 0) {
			return 1;
		}

		return sum(input, 0);
	}

	public static int sum(int input, int ans) {

		if (input == 0) {
			return ans;
		}

		if (input % 10 == 0) {
			ans++;
		}

		return sum(input / 10, ans);

	}
}
