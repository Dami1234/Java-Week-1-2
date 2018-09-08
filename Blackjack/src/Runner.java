
public class Runner {

	public static void main(String[] args) {
		System.out.println(blackjackMethod(22, 11));
	}

	public static int blackjackMethod(int a, int b) {
		if (a <= 21 && b <= 21) 
		{
			if (a > b ) 
			{
			  return a;
			}
			else 
			{
			 return b;
			}
		}
				
		else if (b <= 21 && a > 21)
		{
			return b;
		}
		
		else if (a <= 21 && b > 21)
		{
			return a;
		}
		else {
			return 0;
		}

	}

}
