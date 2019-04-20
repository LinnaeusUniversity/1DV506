package rq222ah_assign1;
import java.util.Random;
public class RandomSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Random rand = new Random();
		int myInt1 = 1+ rand.nextInt(100);
		int myInt2 = 1+ rand.nextInt(100);
		int myInt3 = 1+ rand.nextInt(100);
		int myInt4 = 1+ rand.nextInt(100);
		int myInt5 = 1+ rand.nextInt(100);
		
		int sum = myInt1+ myInt2+ myInt3+ myInt4+ myInt5;
		
		System.out.println("Five random numbers: "+myInt1+ " " +myInt2 +" " +myInt3
				+ " " +myInt4+ " " +myInt5+ "\nThere sum is: "+ sum);

	}

}
