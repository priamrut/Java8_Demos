@FunctionalInterface
interface Lab2Interface {
	void m1();
    static void m2() {
    	System.out.println("Lab2Interface - static method m2 invoked ");
	}
}
class Lab2Sample implements Lab2Interface{

	@Override
	public void m1() {
		System.out.println("Lab2Sample - m1 method ");
	}
	static void m2() {
		System.out.println("Lab2Sample - m2 static method");
	}
}
public class Lab2 {
	public static void main(String[] args) {
		Lab2Interface e1 = ()-> System.out.println("m1 implementation of Lab2Interface");
		e1.m1();
		Lab2Interface.m2();
		Lab2Sample sample = new Lab2Sample();
		sample.m1();
	//	sample.m2();
		Lab2Sample.m2();
		Lab2Interface inter1 = new Lab2Sample();
		inter1.m1();
		
	//	e1.m2();
	}
}
