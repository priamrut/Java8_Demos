import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

interface Manager<T> {
	public default void insert(T t) {
		getList().add(t);
	}
	public List<T> getList();
	public Optional<T> get(int id);
	public default void delete(Predicate<T> pred) {
		getList().removeIf(pred);
	}
	public void update(T t);
}
public class Lab3{
	public static void main(String[] args) {
		EmpManager mgr = new EmpManager();
		for (int i = 1; i < 10; i += 1) {
			Emp d = new Emp();
			d.setEmpno(i);
			d.setEname("enameof" + i);
			d.setSalary(i * 100);
			mgr.insert(d);
		}
		Optional<Emp> emp = mgr.get(11);
		System.out.println("Is Employee Number 11 present " + emp.isPresent());
		System.out.println("Is Employee Number 31 present " + mgr.get(31).isPresent());
		System.out.println("Is Employee Number 01 present " + mgr.get(1).isPresent());
		 
	}
}

