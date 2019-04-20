package rq222ah_assign2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ReverseOrder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        List<Integer> number = new ArrayList<Integer>();
        System.out.println("Enter positive integers: ");
        while( true ) {
        
        System.out.print(" Integers "+ (number.size()+1) + ": ");
        int x = input.nextInt();
        
        if (x < 0)
        	break;
        number.add(x);
        }
        System.out.println(number);
       Collections.reverse(number);
      
       System.out.println(number);
       input.close();
	}

}
