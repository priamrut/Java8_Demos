import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lab6 {

	public static void main(String[] args) {
		
		//Create list of names( 5/6 names) print sorted values 
		List<String> listOfName = Arrays.asList("Anuja", "Priyanka","Vaishali","Sachin","Bhawana","Khushi");
		System.out.println("Map from String to String");
		listOfName.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		System.out.println("Map from String to Integer");
		listOfName.stream().map(s->s.length()).forEach(System.out::println);
		System.out.println("Sum of Length of names : " + listOfName.stream().mapToInt(s->s.length()).sum());
		
	}

}