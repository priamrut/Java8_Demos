import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Lab7 {

	public static void main(String[] args) {

		// Create list of names( 5/6 names) print sorted values
		List<String> listOfName = Arrays.asList("Anuja", "Priyanka", "Vaishali", "Sachin", "Bhawana", "Khushi");
		// List<String> listOfName = Arrays.asList("aa", "bb","cc");
		Optional<String> str = listOfName.stream().reduce((s, s1) -> s + s1);
		str.ifPresent(s -> System.out.println("Reduce returned " + s));
		//OptionalInt sum = listOfName.stream().mapToInt(s -> s.length()).reduce((s, s1) -> s + s1);
		int sum = listOfName.stream().mapToInt(s -> s.length()).sum();
		str.ifPresent(s -> System.out.println("Reduce returned " + sum));

	}

}