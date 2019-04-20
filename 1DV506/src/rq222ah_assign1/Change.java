package rq222ah_assign1;
import java.util.Scanner;
public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);  // create object of scanner.
		
		System.out.print("Price: "); // User instruction.
		float price =scan.nextFloat();
		
		System.out.print("Payment: ");
		int remainingAmount = scan.nextInt();
		
		remainingAmount = remainingAmount-Math.round(price);  // rounds off the remaining change. 
		System.out.println("\nChange: "+remainingAmount);
		
		int numberOfOne_1000 = remainingAmount/1000;  // calculate number of 1000.
		remainingAmount = remainingAmount%1000;  // The remainder after calculating number of 1000kr.
		
		int numberOf_500 = remainingAmount/500;  // calculate number of 500.
		remainingAmount  = remainingAmount%500;  // calculate number of 500.
		
		int numberOf_200 = remainingAmount/200;  // calculate number of 200.
		remainingAmount	 = remainingAmount%200;  // calculate number of 200.
		
		int numberOf_100 = remainingAmount/100;
		remainingAmount  = remainingAmount%100;
		
		int numberOf_50  = remainingAmount/50;
		remainingAmount  = remainingAmount%50;
		
		int numberOf_20  = remainingAmount/20;
		remainingAmount  = remainingAmount%20;
		
		int numberOf_10  = remainingAmount/10;
		remainingAmount  = remainingAmount%10;
		
		int numberOf_5   = remainingAmount/5;
		remainingAmount  =remainingAmount%5;
		
		int numberOf_2   = remainingAmount/2;
		remainingAmount  = remainingAmount%2;
		int numberOf_1   = remainingAmount;
		
		
		
		System.out.println("1000kr bills: "+numberOfOne_1000);
		System.out.println(" 500kr bills: "+numberOf_500);
		System.out.println(" 200kr bills: "+numberOf_200);
		System.out.println(" 100kr bills: "+numberOf_100);
		System.out.println("  50kr bills: "+numberOf_50);
		System.out.println("  20kr bills: "+numberOf_20);
		System.out.println("  10kr bills: "+numberOf_10);
		System.out.println("   5kr bills: "+numberOf_5);
		System.out.println("   2kr bills: "+numberOf_2);
		System.out.println("   1kr bills: "+numberOf_1);
		
		
		scan.close();
	}

}
