import java.util.List;

public class Lab10 {
public static void main(String[] args) {
	List<Emp> list =Emp.getList(100);
	list.stream().skip(10).limit(10).forEach(System.out::println);
// 10 records should sorted according to project
System.out.println("------------Sorted based on projects ------------");
	
list.stream()
	.skip(10).limit(10)
	.sorted((e1,e2) -> e1.getProject().compareTo(e2.getProject()))
	.forEach(System.out::println);

}

}
