import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lab1 {
	public static void main(String[] args) {
//1. Write a function to accept integer and return sqr 
		// Function<Integer,Integer> sqr = x -> x * x;
		UnaryOperator<Integer> sqr = x -> x * x;
		System.out.println("SQR of 10 is " + sqr.apply(10));
		// IntUnaryOperator sqr = x -> x * x;
		// System.out.println("SQR of 10 is " + sqr.applyAsInt(10));
//2. Write a function to accept list/String and return length : Function-function
		Function<String, Integer> len = str -> str.length();
		System.out.println("Length of aaa is " + len.apply("aaa"));
//3. Write a function to accept two strings and return sum of lengths
		BiFunction<String, String, Integer> p3 = (x, y) -> x.length() + y.length();
		System.out.println("P3 : " + p3.apply("Welcome", "Anitha"));
//4. Write a function to return random number
		Supplier<Integer> s = () -> (int) (Math.random() * 100);
		System.out.println("Random number:" + s.get());
//5. Write a function to accept trade name and return share price
		Function<String, Double> sharePrice = str -> str.length() * 100.0;
		System.out.println("Share price for IBM: " + sharePrice.apply("IBM"));
		System.out.println("Share price for Oracle: " + sharePrice.apply("Oracle"));
//6. Write a function to accept two numbers and return sum
		IntBinaryOperator res = (x, y) -> x + y;
		System.out.println("Sum of two numbers 10 and 11 is " + res.applyAsInt(10, 11));
//7. Write a function  to accept string and return true/false based on length even/odd 
		Predicate<String> evenOdd = str -> str.length() % 2 == 0;
		System.out.println("Length of string is even or odd for Vidhya: " + evenOdd.test("Vidhya"));
		System.out.println("Length of string is even or odd for Vidya: " + evenOdd.test("Vidya"));
//8.  Write a  function to accept city name and return temperature
		Function<String, Integer> cityTemp = city -> "Mumbai".equalsIgnoreCase(city) ? 33 : 28;
		System.out.println("City Temperature for Mumbai : " + cityTemp.apply("mumbai") + " celsius");
		System.out.println("City Temperature for Delhi : " + cityTemp.apply("Delhi") + " celsius");
//9. Write a  function to accept Dept and print the same 
		Consumer<Dept> printDept = dept -> System.out.println(dept);
		printDept.accept(new Dept(10,"HR", "NCR"));
//10. Write a function to accept Dept and Emp and print the same
		BiConsumer<Dept, Emp> deptEmp = (dept, emp) -> System.out.println("Department : " + dept +"\n, Employee : "+ emp);
		deptEmp.accept(new Dept(10,"HR", "NCR"), new Emp(1,"Vaishali",1111.11));
	}
}
