@FunctionalInterface
interface Calc {
	int process(int x, int y);
}

public class Lab2 {
	public static void main(String[] args) {
		Calc add = (int x, int y) -> x + y;
		Calc sub = (a, b) -> a - b;
		Calc div = (a, b) -> a / b;
		Calc mul = (a, b) -> a * b;

		System.out.println("Sum of x and y " + add.process(10, 20));
		System.out.println("Substraction of a,b is " + sub.process(10, 20));
		System.out.println("Division of a,b is " + div.process(20, 10));
		System.out.println("Multiplication of a, b is " + mul.process(10, 30));
	}
}
