import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lab9 {
public static void main(String[] args) {
	List<Emp> list = Emp.getList(10);
	list.forEach(System.out::println);
	List<String> listnames = list.stream().map(Emp::getEname).distinct().collect(Collectors.toList());
	System.out.println(listnames);


	   // Compute sum of salaries by department
    Map<String, Double> totalByDept
        = list.stream()
                   .collect(Collectors.groupingBy(Emp::getDept, Collectors.summingDouble(Emp::getSalary)));
    System.out.println("Compute sum of salaries by department'");
    System.out.println(totalByDept);
	// sum of salaries per department
	// Map of department name and list of people working in that department
	 Map<String, List<Emp>> byDept
     = list.stream()
                .collect(Collectors.groupingBy(Emp::getDept));
	 System.out.println("Map of department name and list of people working in that department");
	 byDept.forEach((key,value)->System.out.println(key + " : " + value ));
	
     // Map of department name and number of people working in that department
     Map<String,Long> x1 =list.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.counting()));
     System.out.println("Number of people per Dept" + x1);
     // Map of project name and number of people working in that project
      Map<String,Long> x =list.stream().collect(Collectors.groupingBy(Emp::getProject, Collectors.counting()));
      System.out.println("Number of people per Project" + x);
      // minimum salaried employee  per project
      Comparator<Emp> empComparator = (e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary());
      Map<String, Optional<Emp> > minSalProj = list.stream()
              .collect(Collectors.groupingBy(Emp::getProject, Collectors.minBy(empComparator)));
      System.out.println("minimum salary per project: ");
      minSalProj.entrySet().stream().forEach(r -> System.out.println(r.getKey()+":"+r.getValue().get()));
      // maximum salaried employee  per department
      Map<String, Optional<Emp> > maxSalDept = list.stream()
              .collect(Collectors.groupingBy(Emp::getDept, Collectors.maxBy(empComparator)));
      System.out.println("maximum salary per department: ");
      maxSalDept.entrySet().stream().forEach(r -> System.out.println(r.getKey()+":"+r.getValue().get()));
          
}
}
