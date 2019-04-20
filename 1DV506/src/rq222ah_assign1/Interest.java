package rq222ah_assign1;
import java.util.Scanner;
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Initial savings: "); // User instruction.
		double intialSaving =scan.nextDouble();
		
		System.out.print("Interest rate (in percentages): "); //User instruction.
		double percentage = scan.nextDouble();
		
		double futureValueIn5Years = intialSaving* Math.pow(1+percentage/100, 5);
		    futureValueIn5Years = Math.round(futureValueIn5Years);
		    
		    
		System.out.println("\nThe value of your savings after 5 years is: " 
		+ (int)futureValueIn5Years);
		
		scan.close();
	}

}
