interface Process {
	int process(int x);
}

public class Lab3 {
	public static void main(String[] args) {
		// For single input param, () are optional
		Process sqr = (int x) -> {
			System.out.println("in sqr ");
			return x * x;
		};
		Process cube = x -> x * x * x;
		System.out.println("Square of 10 is " + sqr.process(10));
		System.out.println("Cube of 5 is " + cube.process(5));
	}
}
