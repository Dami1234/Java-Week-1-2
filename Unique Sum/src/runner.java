
public class runner {

	public static void main(String[] args) {
		System.out.println(uniquesumMethod(2, 2, 2));
	}

	public static int uniquesumMethod(int a, int b, int c) 
	{
		int sum = 0;
		
		if (a != b && a != c)
		{
			sum += a;
		} 
		if (b != a && b != c) 
		{
			sum += b;
		}
		if (c != b && c != a) 
		{
			sum += c;
		}
		
		return sum;
	}

}
