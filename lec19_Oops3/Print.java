package lec19_Oops3;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] sr = { 1, 2, 3, 1 };
		String[] ar = { "22", "sad", "ssd" };
//		name(ar);
//		name(sr);

		People[] p1 = new People[5];
		for (int i = 0; i < p1.length; i++) {
			p1[i] = new People();
		}

		name(p1);
	}

	public static <T extends People> void name(T[] sr) {

		for (int i = 0; i < sr.length; i++) {
			System.out.println(sr[i].population+ " ");
		}
	}

}
