package rq222ah_assign1;
import java.util.Scanner;
public class SumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide a three digit number: "); // User instruction.
		
		int userInput = scan.nextInt();
		
		int myFirstDigitNumber  = userInput/100; // 483/100 = 4.
	
		int mySecondDigitNumber = userInput%10; // 483%10 = 3.
		int myThirdDigitNumber  = userInput%100/10; // 483%100 = 48.48/10=8.
		
		
		int sum = myFirstDigitNumber + mySecondDigitNumber + myThirdDigitNumber; // calculate sum of three digits.
	
		System.out.println("Sum of digits: "+sum);
		
		scan.close();
		
	}

}
