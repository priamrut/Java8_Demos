import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lab2 {

	public static void main(String[] args) {
		
		//Create list of names( 5/6 names) print sorted values 
		List<String> listOfName = Arrays.asList("Anuja", "Priyanka","Vaishali","Sachin","Bhawana","Khushi");
		Stream<String> sortedstr = listOfName.stream().sorted();
	    System.out.println("Sorted NameList is: ");
	     sortedstr.forEach(System.out::println);
	     System.out.println("\n\nSorted NameList is: ");
	     listOfName
	     			.stream()
	     			.sorted((s,s1)->s1.compareTo(s))
	     			.forEach(System.out::println);
	}

}