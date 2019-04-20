package rq222ah_assign1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner scan = new Scanner(System.in); 
		System.out.print("Provide radius: "); // User instruction.
	
		
		double pi = Math.PI;
		double radius = scan.nextDouble(); //Math.pow(scan, 2);
		double area   = Math.pow(radius, 2)*pi;
		
		DecimalFormat areaFormat = new DecimalFormat("0.#");
		String oneDecimal = areaFormat.format(area);
		
		
		System.out.println("\nCorresponding area is: "+oneDecimal);
		

		scan.close();
	}

}
