package rq222ah_assign1;
import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		
		System.out.print("Temperature (C): "); //user instruction.
		double T =scan.nextDouble(); // temperature celsius.
		
		System.out.print("Wind speed (m/s): "); // user instruction.
		double V = scan.nextDouble(); // wind speed in m/s.
		
		double newV=V*3.6; // 1m/s=3.6km/p. change m/s to km/p.
		
		/* Twc = 13.12 + 0.6215*T - 11.37*V^{0.16} + 0.3965*T*V^{0.16}
		 * 
		 */
		
		double Twc0 = 13.12 + 0.6215 * T
				- 11.37 * Math.pow(newV, 0.16)+ 0.3965*T*Math.pow(newV, 0.16);
		// one decimal correctly rounded off.
		int places=1;
		double roundingOff=Math.pow(10, places);
		double Twc =Math.round(Twc0*roundingOff)/roundingOff;
		
		System.out.println("\nWind Chill Temperature (C): " + Twc);
		
		scan.close();
	}

}
