
public class Runner {

	public static void main(String[] args) {
		System.out.println(parameter(4, 6, true));

	}

	public static int parameter(int a, int b, Boolean Bool) 
	{
		if (Bool == false) 
		{
			return a + b;
		}
		else
		{
			return a * b;
		}
	}

}
