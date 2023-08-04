import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lab5 {

	public static void main(String[] args) {
		
		List<String> listOfName = Arrays.asList("Anuja", "Priyanka","Vaishali","Sachin","Bhawana","Khushi");
		System.out.println("Filter and ForEach");
	     listOfName
	     			.stream()
	     			.peek(s->System.out.println("before filter" +s ))
	     			.filter(s->s.endsWith("i"))
	     			.forEach(System.out::println);
	     System.out.println("Filter and FindFirst");
	     Optional<String> opstring = listOfName
			.stream()
			.peek(s->System.out.println("before filter" +s ))
			.filter(s->s.endsWith("i"))
			.findFirst();
	     System.out.println(opstring);
	}

}