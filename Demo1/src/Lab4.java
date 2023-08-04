interface Add {
	void incr(int x);
}

public class Lab4 {
	public static void main(String[] args) {
		int total = 10;
		Add a1 = x -> {
			System.out.println("in a1 with " + x);
			x += total;
		};
		a1.incr(10);
		a1.incr(10);
		a1.incr(10);
		System.out.println("Total = " + total);
	}
}
