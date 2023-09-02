package lec19_Oops3;

public class Pair_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair<Integer,String> p1 = new Pair<>(10, "");
		System.out.println(p1);
		Pair<Pair<Integer, String>, String>p2=new Pair<Pair<Integer,String>, String>(p1, "anca");
		System.out.println(p2.getFrst());

	}

}
