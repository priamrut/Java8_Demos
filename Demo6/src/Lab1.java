import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lab1 {

	public static void main(String[] args) {
		Stream<Integer> strint = Stream.of(10,5,7,53,77,66,1);
//		strint.forEach(System.out::println);
		Stream<String> strstr = Stream.of("aa","bb","vaishali","seema","amar", "amey","saloni", "zana");
		List<String> l1 = new ArrayList<String>();
		l1.add("aa"); l1.add("bb");l1.add("bbb");
		strint.forEach(System.out::println);
		strstr.forEach(System.out::println);
		l1.stream().forEach(System.out::println);
		l1.stream().forEach(System.out::println);
		l1.stream().forEach(System.out::println);
	
	}

}
