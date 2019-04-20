package rq222ah_assign1;
import java.util.Scanner;
public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // create object of scanner.
		
		System.out.print("Provid a temperature in Fahrenheit: "); // User instruction.
		float temperatureInFahrenheit = scan.nextFloat(); 	// read string
		
		// Declare Celsius. C = (F-32)5/9.
		float celsius = (temperatureInFahrenheit-32)*5/9;
		
		System.out.println("Corresponding temperature in Celsius is: "+ celsius);
		
		scan.close();
	}

}
