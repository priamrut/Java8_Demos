
public class Lab1 {

	public static void main(String[] args) {
			Runnable runnable = ()->System.out.println("Hello from Lab1Helper");
			Thread t1 = new Thread(runnable);
			t1.start();
	}

}
