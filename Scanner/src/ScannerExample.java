import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean badInput = true;
		int input = 0;
		do {
			System.out.println("Please enter a number");
			try {
				input = Integer.parseInt(sc.nextLine());
				badInput = false;
			} catch (Exception ex) {
				System.out.println("Please enter a valid number");
			}
		} while (badInput);
		System.out.println("Your number was: " + input);
	}
}
