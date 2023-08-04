import java.util.ArrayList;
import java.util.List;

public class Emp  {
	private int empno;
	private String ename;
	private double salary;
	private String project; // proj1, proj2, proj3
	private String dept; // HR, Fin, LT
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", project=" + project + ", dept="
				+ dept + "]";
	}

	public static List<Emp> getList(int no){
		List<Emp> list = new ArrayList<Emp>();
		String[] names = {  "Vaishali", "Saloni","Vishal","Imran","Simran","Soni","Seema"	};
		String[] projects = {"proj1","proj2","proj3","proj4"};
		String[] depts = {"hr", "fin", "lt" };
		for (int i = 1;i <= no; i++) {
			Emp e1 =new Emp();
			e1.setEmpno(i);
			e1.setEname(names[i%names.length]);
			e1.setProject(projects[i % projects.length]);
			e1.setDept(depts[i % depts.length]);
			e1.setSalary((int)(Math.random()*1000));
	//		e1.setSalary(i *100);
			list.add(e1);
		}
		return list;
		
	}
	
	
}
