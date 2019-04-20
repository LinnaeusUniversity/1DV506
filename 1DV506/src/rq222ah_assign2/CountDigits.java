package rq222ah_assign2;
import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a postive integers: ");
		int userInput = scan.nextInt();
		int zero = 0, odd =0, even =0; // Initialising zero,odd,and Even.
		
		while (userInput > 0) {			//step1 10023>0 step3 1002%10=2 step5 100%10=0
			int digit = userInput % 10;		
			if (digit == 0) {
				zero++; 
			} else if (digit % 2 == 0) {	//step4 2%2=0
				even++; 
			} else {
				odd++; 
			}
			userInput = userInput / 10;	// step2 10023=1002 step6 10/10=1
		}
		System.out.println("Zeros: " + zero);
		System.out.println("Odds: " + odd);
		System.out.println("Evens: " + even);
		scan.close();
	}

}
