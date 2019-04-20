package rq222ah_assign1;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter value of X1 and Y1: ");
		double x1 =scan.nextDouble();
		double y1 =scan.nextDouble();
		
		System.out.println("Enter the value of X2 and Y2: ");
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		// distance = Sqrt( (x1-x2)^2 + (y1-y2)^2 )
		
		double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		int places=3;
		double roundingOff=Math.pow(10, places);
		double distance=Math.round(d*roundingOff)/roundingOff;
		
	
		System.out.println("Distance between the two points is: "+distance);
				
					scan.close();
	}

}
