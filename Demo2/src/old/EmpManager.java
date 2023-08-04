package old;

import java.util.ArrayList;
import java.util.List;

public class EmpManager {

	private List<Emp> list = new ArrayList<Emp>();

	public void insert(Emp d) {
		list.add(d);
	}

	public List<Emp> getList() {
		return list;
	}

	public void delete(Emp d) {
		for (Emp dept : list) {
			if (dept.getEmpno() == d.getEmpno()) {
				list.remove(dept);
				break;
			}
		}
	}

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
		mgr.delete(new Emp(2, "", 222.00));
		// mgr.delete((d)->d.getEmpno()==20);
		Emp d = new Emp();
		d.setEmpno(5);
		d.setEname("Vaishali");
		d.setSalary(111111);
		mgr.update(d);
		for (Emp emp : mgr.getList()) {
			System.out.println(emp);
		}
	}
}
