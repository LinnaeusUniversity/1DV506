package rq222ah_assign2;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Provide an odd positive integer: ");
		int userInput = scan.nextInt();
		if (userInput % 2 == 0 || userInput < 0) {
			System.err.println("Error! Please provide an odd positive integer\"3,5,7\"");
			System.exit(0);
			scan.close();
		}

		System.out.println("\nRight-Angled Triangle: ");

		for (int i = 1; i <= userInput; i++) {
			for (int j = userInput; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
		}
		System.out.println("\nIsoscelse Triangles: ");
		for (int i = 1; i <= userInput; i = i + 2) {
			for (int j = 1; j <= (userInput - i) / 2; j++) {
				System.out.print(" ");
			}
			for (int h = 1; h <= i; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
