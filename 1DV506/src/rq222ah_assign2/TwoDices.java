package rq222ah_assign2;
import java.util.Random;
public class TwoDices {

	public static void main(String[] args) {

	 	Random randomDice =new Random();
        int[] count= new int[13]; 
        System.out.println("Frequency table (sum,count) for rolling two dices 10000 times");
        for(int x = 1 ; x <=10000; x++ ) {
        	int randDice1=randomDice.nextInt(6)+1;
        	int randDice2=randomDice.nextInt(6)+1;
        	int sumOfDice = randDice1+randDice2;
        	count[sumOfDice]++;
        }
        for (int x =2; x<count.length; x++) {
        	System.out.println(x + ":\t"+ count[x]);
        }

	}

}
