package old;

import java.util.ArrayList;
import java.util.List;

public class DeptManager {

	private List<Dept> list = new ArrayList<Dept>();

	public void insert(Dept d) {
		list.add(d);
	}

	public List<Dept> getList() {
		return list;
	}

	public void delete(Dept d) {
		for (Dept dept : list) {
			if (dept.getDeptno() == d.getDeptno()) {
				list.remove(dept);
				break;
			}
		}
	}

	public void update(Dept d) {
		for (Dept dept : list) {
			if (dept.getDeptno() == d.getDeptno()) {
				dept.setDname(d.getDname());
				dept.setLoc(d.getLoc());
				break;
			}
		}

	}

	public static void main(String[] args) {
		DeptManager mgr = new DeptManager();
		for (int i = 10; i < 50; i += 10) {
			Dept d = new Dept();
			d.setDeptno(i);
			d.setDname("Dnameof" + i);
			if (i % 20 == 0)
				d.setLoc("Pune");
			else
				d.setLoc("Hyd");
			mgr.insert(d);
		}
		mgr.delete(new Dept(20, "", ""));
		// mgr.delete((d)->d.getDeptno()==20);
		Dept d = new Dept();
		d.setDeptno(10);
		d.setDname("HR");
		d.setLoc("BLR");
		mgr.update(d);
		for (Dept dept : mgr.getList()) {
			System.out.println(dept);
		}
	}
}
