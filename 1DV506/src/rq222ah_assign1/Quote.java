package rq222ah_assign1;
import java.util.Scanner;
public class Quote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		System.out.print("Write a line of text: "); //User instruction.
		String text = scan.nextLine(); // read string.
		
		System.out.println("Quote: " +"\"" + text + "\"");
		
		
		scan.close();
		
	}

}
