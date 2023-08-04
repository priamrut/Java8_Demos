import java.util.List;
import java.util.Scanner;

public class Lab11 {
public static void main(String[] args) {
	List<Emp> list =Emp.getList(10000);
	System.out.println("Enter a number to start");
	Scanner scanner = new Scanner(System.in);
	scanner.nextInt();
	
	
	System.out.println("Filtering and Printing data ");
//	list.stream().filter(e->e.getSalary()>100 && e.getSalary() <500).forEach(e->System.out.print(e.getEmpno() + " "));
	list.parallelStream().filter(e->e.getSalary()>100 && e.getSalary() <500).forEach(e->System.out.print(e.getEmpno() + " "));
}

}
