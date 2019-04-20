package rq222ah_assign2;
import java.util.Scanner;
public class Backwards {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Provide a line of text: ");
		String input = scan.nextLine();

		int str = input.length();
		// Backwards
		for (int i = 1; i <= str; i++) {
			char ch = input.charAt(str - i);
			System.out.print(ch);
		}
		scan.close();

	}

}
