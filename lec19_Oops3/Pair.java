package lec19_Oops3;

public class Pair<T, S> {

	private T frst;
	private S scnd;

	public Pair(T frst, S scnd) {
		this.frst = frst;
		this.scnd = scnd;
	}

	public void setScnd(S scnd) {
		this.scnd = scnd;
	}

	public void setFrst(T frst) {
		this.frst = frst;
	}

	public T getFrst() {
		return frst;
	}

	public S getScnd() {
		return scnd;
	}
}
