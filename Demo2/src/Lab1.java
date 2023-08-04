@FunctionalInterface
interface Lab1Interface {
	void m1();

	default void m2() {
		System.out.println("in Lab1Interface - m2 - default method");
	}
}
class Sample1 implements Lab1Interface{
	@Override
	public void m1() {
		System.out.println("Sample1 class - m1 implementation");
	}
}
class Sample2 implements Lab1Interface{
	@Override
	public void m1() {
		System.out.println("Sample2 class - m1 implementation");
	}
	@Override
	public void m2() {
		System.out.println("Sample2 class - m2 implementation");
	}
}
public class Lab1 {
	public static void main(String[] args) {
		Lab1Interface impl = ()->System.out.println("in Lab1Interface m1 method");
		impl.m1();
		impl.m2();
		Sample1 s1 = new Sample1();
		s1.m1();
		s1.m2();
		Sample2 s2 = new Sample2();
		s2.m1();
		s2.m2();
	}
}
