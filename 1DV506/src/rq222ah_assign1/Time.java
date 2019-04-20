package rq222ah_assign1;
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give a number of seconds: "); // User instruction.
		int remainingSeconds = scan.nextInt();
		
		int hour = remainingSeconds/3600; // calculate number of hours.
		remainingSeconds = remainingSeconds%3600; // remainder after calculating the hours.
		
		int minute = remainingSeconds/60; // calculate number of minutes.
		remainingSeconds = remainingSeconds%60; // remainder after calculating the minutes.
		
		int seconds = remainingSeconds;
		
		System.out.println("This corresponds to: "+hour+ " hours, "
		+minute+" minutes and "+seconds+ " seconds."); // print the results.
		
		scan.close();
		
	}

}
