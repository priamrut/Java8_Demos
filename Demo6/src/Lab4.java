import java.util.Arrays;
import java.util.List;

public class Lab4 {
	public static void main(String[] args) {

		List<Integer> randomNos = Arrays.asList(2, 4, 6, 8, 9, 11, 20, 25, 60, 78);
		System.out.println("Nutural sorted list :");
		randomNos.stream().sorted().forEach(System.out::println);
		System.out.println("Reverse sorted list :");
		randomNos.stream().sorted((s, s1) -> s1.compareTo(s)).forEach(System.out::println);
		System.out.println("Filter  < 70 :");
		randomNos.stream().filter(s -> s < 70).forEach(System.out::println);
		System.out.println("Filter > 50 :");
		randomNos.stream().filter(s -> s > 50).forEach(System.out::println);
		System.out.println("Filter > 50 and < 70");
		randomNos.stream().filter(s -> s > 50 & s < 70).forEach(System.out::println);
		System.out.println("Filter > 50 and < 70");
		randomNos.stream().filter(s -> s > 50).filter(s-> s < 70).forEach(System.out::println);
		boolean anyMatch = randomNos.stream().anyMatch(s -> s == 55);
		System.out.println("Show true if any number matches criteria -> 55 " + anyMatch);
		boolean matchAll = randomNos.stream().allMatch(s -> s > 12);
		System.out.println("Show true if all the numbers are more than 12 " + matchAll);
	
	}
}