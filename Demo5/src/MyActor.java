import java.util.Arrays;

public class MyActor {

	public static void main(String[] args) {
		Class cls1 = User2.class;
		System.out.println("Annotations : " + Arrays.toString(cls1.getAnnotations()));
	}

}
