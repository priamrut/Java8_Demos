import java.util.List;
import java.util.OptionalDouble;

public class Lab8 {
public static void main(String[] args) {
	List<Emp> list =Emp.getList(10);
	list.forEach(System.out::println);
	System.out.println("Unique/Distinct Names ");
	list.stream()
		//	.map(e->e.getEname())
			.map(Emp::getEname)
			.distinct()
			.forEach(System.out::println);
	System.out.println("Max of Salaries for Department fin ");
	
	double sumProj1Sal = list.stream()
	    	.filter(emp->emp.getProject().equals("proj1"))
	      	.mapToDouble(Emp::getSalary)
	    	.sum();
	System.out.println("Sum of Salaries for Project proj1 " + sumProj1Sal); 
	OptionalDouble saloSal = list.stream()
	    	.filter(emp->emp.getEname().equalsIgnoreCase("saloni"))
	       	.mapToDouble(Emp::getSalary)
	    	.max();
	  System.out.println("Max Salary for Employee Name 'Saloni' " + saloSal);

}
}
