import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		
		System.out.println("Enter date in the form of dd-mm-yyyy");
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String date = sc.nextLine();
		LocalDate d = LocalDate.parse(date, formatterDate);
		System.out.println("Entered date: " + d);
		System.out.println("Enter time in the form of hh:mm");
		String time = sc.nextLine();
		LocalTime t = LocalTime.parse(time);
		System.out.println("Entered time: " + t);

	}

}