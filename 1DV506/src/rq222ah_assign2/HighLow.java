package rq222ah_assign2;
import java.util.*;

public class HighLow {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int num = rand.nextInt(100) + 1; 
		for (int i = 1; i <= 11; i++) {
			if (i == 11) { 
				System.out.println("\nSorry! \nYou have entered your 10 allowed guesses: ");
				System.exit(0);
			}
			System.out.print("Guess" + i + ": ");
			int guess = scan.nextInt(); // read guess integers from the user.

			if (guess > num) {
				System.out.println(" Clue: Lower");

			} else if (guess < num) {
				System.out.println(" Clue: higher");
			} else {
				System.out.println(" Correct answer after " + i + " attempts-well done!");
				System.exit(0);

			}
		}

		scan.close();
	}

}
