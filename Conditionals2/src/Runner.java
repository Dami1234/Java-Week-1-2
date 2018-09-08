
public class Runner {

	public static void main(String[] args) {


		for (int i = 0; i < 10; i++) {
			
			System.out.println(i);
		}

	}

	public static int parameter(int a, int b, Boolean Bool) {
		if (Bool == false) {
			return a + b;
		} else {
			return a * b;
		}

	}

}
