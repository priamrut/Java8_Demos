import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lab3 {

	public static void main(String[] args) {
		
		List<String> listOfName = Arrays.asList("Anuja", "Bishal","Vaishali","Sachin","Bhawana","Saloni", "Sani");
		System.out.println("Filtered List for name starting with S");
		listOfName.stream()
				.filter(s->s.startsWith("S"))
				.forEach(System.out::println);
	//-------------------------------
		Optional<String> nameendss = listOfName.stream()
		.filter(s->s.endsWith("ni"))
		.findFirst();
		System.out.println("Filter for name ending with ni and print first name " + nameendss );
		
		
	}

}