package rq222ah_assign1;
import java.util.Scanner;
public class ShortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter your first name:");
		String fName = scan.nextLine();
			
		System.out.print("Enter your surname:");
		String sName = scan.nextLine();
		
		char dot = '.';
		char first = fName.charAt(0);
	
		String sub = sName.substring(0,4); 
		//What will happen if the last name consists of less than four letters?
		//The method SubString will throw an IndexOutOfBoundException.
		
		System.out.println("\nFirst name: " +fName+"\nLast name: "+sName+ "\nShort name: "+first+dot+sub);
		
		scan.close();
		
	}

}
