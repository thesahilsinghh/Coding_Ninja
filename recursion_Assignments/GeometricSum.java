package recursion_Assignments;

import java.text.Format;

public class GeometricSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(findGeometricSum(3));
	}

	public static double findGeometricSum(int k) {
		// Write your code here

	return sum(0.0, k);
		
		}

	public static double sum(double sum, int k) {
		// TODO Auto-generated method stub

		if (k == 0) {

			return sum += 1;

		}

		sum+=1/Math.pow(2, k);
		return sum(sum, k-1);
		
	}

}
