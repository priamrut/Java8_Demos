

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class EmpManager implements Manager<Emp> {

	private List<Emp> list = new ArrayList<Emp>();

	public List<Emp> getList() {
		return list;
	}
	@Override
	public Optional<Emp> get(int id) {
		for (Emp emp : list) {
			if (emp.getEmpno() == id) 
				return Optional.of(emp);
		}
		return Optional.empty();
		
	}
	
	/*
	public void delete(Emp e) {
		Predicate<Emp> pred = (emp)->emp.getEmpno() == e.getEmpno();
		list.removeIf(pred);
	}
*/
	/*
	public void delete(Predicate<Emp> pred) {
		list.removeIf(pred);
	}
	*/
	public void update(Emp d) {
		for (Emp emp : list) {
			if (emp.getEmpno() == d.getEmpno()) {
				emp.setEname(d.getEname());
				emp.setSalary(d.getSalary());
				break;
			}
		}
	}

	public static void main(String[] args) {
		EmpManager mgr = new EmpManager();
		for (int i = 1; i < 10; i += 1) {
			Emp d = new Emp();
			d.setEmpno(i);
			d.setEname("enameof" + i);
			d.setSalary(i * 100);
			mgr.insert(d);
		}
	//	mgr.delete(new Emp(2, "", 222.00));
		 mgr.delete((d)->d.getEmpno()==2);
		 
		Emp d = new Emp();
		d.setEmpno(5);
		d.setEname("Vaishali");
		d.setSalary(111111);
		mgr.update(d);
//		mgr.getList().forEach(emp -> System.out.println(emp));
		mgr.getList().forEach(System.out::println);
	/*	for (Emp emp : mgr.getList()) {
			System.out.println(emp);
		}
		*/
	}
}
