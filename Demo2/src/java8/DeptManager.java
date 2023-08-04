package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DeptManager implements Manager<Dept> {

	private List<Dept> list = new ArrayList<Dept>();

	public List<Dept> getList() {
		return list;
	}

	/*
	 * public void delete(Dept d) { Predicate<Dept> pred = (dept) ->
	 * dept.getDeptno() == d.getDeptno(); list.removeIf(pred); }
	 */
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
			Dept d = new Dept(i, "Dnameof" + i, (i % 20 == 0 ? "Pune" : "Hyd"));
			mgr.insert(d);
		}
		// mgr.delete(new Dept(20, "", ""));
		mgr.delete((d) -> d.getDeptno() == 20);
		// mgr.delete((d)->d.getLoc().equals("Pune"));
		Dept d = new Dept(10, "HR", "BLR");
		mgr.update(d);
		mgr.getList().forEach(dept -> System.out.println(dept));
		/*
		 * for (Dept dept : mgr.getList()) { System.out.println(dept); }
		 */
	}
}
