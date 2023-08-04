import java.util.Optional;

public class Lab2 {

	public Optional<Integer> divide(int x, int y) {
		if (y == 0)
			return Optional.empty();
		else
			return Optional.of(x / y);
	}

	public static void main(String[] args) {
		Lab2 lab2 = new Lab2();
		Optional<Integer> no = lab2.divide(100, 10);
		System.out.println("Division of 100 and 10 is " + no);
		no = lab2.divide(100, 0);
		System.out.println("Division of 100 and 0 is " + no);
	}

}
